package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

abstract class Abstract {
    String s;
    public Abstract(String s) { this.s = s; }
    abstract void af();
}
class All2 extends Abstract implements Multiple {
    All2() { super("All2"); }
    void af() { print("All.af"); }
    public void f1() { print("All.f1"); }
    public void g1() { print("All.g1"); }
    public void f2() { print("All.f2"); }
    public void g2() { print("All.g2"); }
    public void f3() { print("All.f3"); }
    public void g3() { print("All.g3"); }
    public void h() { print("All2.h"); }
}
public class P15 {
    static void takes1(Interface1 i) {
        i.f1();
        i.g1();
    }
    static void takes2(Interface2 i) {
        i.f2();
        i.g2();
    }
    static void takes3(Interface3 i) {
        i.f3();
        i.g3();
    }
    static void takesAll(All2 a) {
        a.f1();
        a.g1();
        a.f2();
        a.g2();
        a.f3();
        a.g3();
        a.h();
    }
    static void takesAbstract(Abstract a) {
        a.af();
    }
    public static void main(String args[]) {
        All2 a = new All2();
        takes1(a);
        takes2(a);
        takes3(a);
        takesAll(a);
        takesAbstract(a);
    }
}