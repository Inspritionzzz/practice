package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

/**
 * 抽象类的初始化问题；
 */
abstract class Test2{
    abstract void f1();
    Test2(){
        f1();
    }
}
class Test3 extends Test2{

    int i=3;
    @Override
    void f1() {
        print("Test3 "+i);
    }
}
public class P3 {
    public static void main(String[] args) {
        Test3 test3=new Test3();
        test3.f1();
    }
}
