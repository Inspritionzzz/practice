package com.bupt.thinkinjava.c8;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

/**
 * 导出类的初始化顺序：1  基类（先域在构造器）  2   本类的域    3   本类的构造器
 * 测试共享变量：在其他类中的方法中（composing方法）传入某个类的引用；
 *             并使用dispose清理；
 */
class Share1{
    private static int refcount=0;
    private static int count=0;
    private final int id=count++;

    public Share1(){
        print("Creating "+this);
    }
    void addRefcount(){
        refcount++;
    }

    void dispose(){
        if(--refcount==0)
            print("清理完毕");
    }

    public String toString() {
        return "Share1 "+id;
    }

    public static int getRefcount() {
        return refcount;
    }
}
class Member {

    public Member(String id) {
        print("Member constructor " + id);
    }

    Share1 share1;
    void composing(Share1 share1){
        print("Member composing");
        this.share1=share1;
        this.share1.addRefcount();
        print(Share1.getRefcount());
    }
    void disposing(){
        print("Member disposing");
        share1.dispose();
        print(Share1.getRefcount());
    }
}
class Rodent2 {
    Member m1 = new Member("r1"), m2 = new Member("r2");
    public Rodent2() { print("Rodent constructor"); }
    public void hop() { print("Rodent hopping"); }
    public void scurry() { print("Rodent scurrying"); }
    public void reproduce() { print("Making more Rodents"); }
    public String toString() { return "Rodent"; }

    Share1 share1;
    void composing(Share1 share1){
        print("Rodent2 composing");
        this.share1=share1;
        this.share1.addRefcount();
        print(Share1.getRefcount());
    }
    void disposing(){
        print("Rodent2 disposing");
        share1.dispose();
        print(Share1.getRefcount());
    }

}
class Mouse2 extends Rodent2 {
    Member m1 = new Member("m1"), m2 = new Member("m2");
    public Mouse2() { print("Mouse constructor"); }
    public void hop() { print("Mouse hopping"); }
    public void scurry() { print("Mouse scurrying"); }
    public void reproduce() { print("Making more Mice"); }
    public String toString() { return "Mouse"; }

    Share1 share1;
    void composing(Share1 share1){
        print("Mouse2 composing");
        this.share1=share1;
        this.share1.addRefcount();
    }
    void disposing(){
        print("Mouse2 disposing");
        share1.dispose();
    }
}
class Gerbil2 extends Rodent2 {
    Member m1 = new Member("g1"), m2 = new Member("g2");
    public Gerbil2() { print("Gerbil constructor"); }
    public void hop() { print("Gerbil hopping"); }
    public void scurry() { print("Gerbil scurrying"); }
    public void reproduce() { print("Making more Gerbils"); }
    public String toString() { return "Gerbil"; }

    Share1 share1;
    void composing(Share1 share1){
        print("Gerbil2 composing");
        this.share1=share1;
        this.share1.addRefcount();
    }
    void disposing(){
        print("Gerbil2 disposing");
        share1.dispose();
    }
}
class Hamster2 extends Rodent2 {
    Member m1 = new Member("h1"), m2 = new Member("h2");
    public Hamster2() { print("Hamster constructor"); }
    public void hop() { print("Hamster hopping"); }
    public void scurry() { print("Hamster scurrying"); }
    public void reproduce() { print("Making more Hamsters"); }
    public String toString() { return "Hamster"; }

    Share1 share1;
    void composing(Share1 share1){
        print("Hamster2 composing");
        this.share1=share1;
        this.share1.addRefcount();
    }
    void disposing(){
        print("Hamster2 disposing");
        share1.dispose();
    }
}

public class P12a_P14{
    public static void main(String args[]) {
        new Hamster2();
        print("+++++++++++++++++++++");
        Member member=new Member("1");
        member.composing(new Share1());
        member.disposing();
    }
}