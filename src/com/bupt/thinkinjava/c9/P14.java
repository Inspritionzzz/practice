package com.bupt.thinkinjava.c9;
interface Ia{
    void f1();
    void f2();
}
interface Ib{
    void f3();
    void f4();
}
interface Ic{
    void f5();
    void f6();
}
interface Id extends Ia,Ib,Ic{
    void f7();
}
class Test9{

}

class Test10 extends Test9 implements Id{
    @Override
    public void f1() {

    }

    @Override
    public void f2() {

    }

    @Override
    public void f3() {

    }

    @Override
    public void f4() {

    }

    @Override
    public void f5() {

    }

    @Override
    public void f6() {

    }

    @Override
    public void f7() {

    }
}
public class P14 {
    public static void t(Ia x) {  }
    public static void u(Ib x) {  }
    public static void v(Ic x) {  }
    public static void w(Id x) {  }
    public static void main(String[] args) {
        Test10 test10=new Test10();
        t(test10);
        u(test10);
        v(test10);
        w(test10);
    }
}
