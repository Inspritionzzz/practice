package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 使用匿名内部类获得对接口的引用；
 * 把引用传入另一个类，并在这个类中调用接口中的方法；
 */
interface U{
    void f1();
    void f2();
    void f3();
}
class A{
    U getU(){
        return new U() {
            @Override
            public void f1() {
                print("f1 from A");
            }

            @Override
            public void f2() {
                print("f2 from A");
            }

            @Override
            public void f3() {
                print("f3 from A");
            }
        };
    }
}
class B{
    U[] us;
    int next=0;
    public B(int size){
        us=new U[size];
    }

    public void setU(U u) {
        us[next++]=u;
    }

    public void setUs(){
        us=null;
    }

    public void getUs(){
        for(int i=0;i<us.length;i++){
            us[i].f1();
            us[i].f2();
            us[i].f3();
        }
    }

    public int getUsLength(){
        return us.length;
    }
}
public class P23 {
    public static void main(String[] args) {
        A a=new A();
        B b=new B(3);
        for(int i=0;i<b.getUsLength();i++){
            b.setU(a.getU());
        }
        b.getUs();
        b.setUs();
        print(b.us);

    }
}
