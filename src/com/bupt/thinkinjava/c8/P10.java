package com.bupt.thinkinjava.c8;

import static com.bupt.utils.Print.print;

/**
 * 测试构造器中调用方法的情况
 *
 */
class First{

    First(){
        f2();
    }
    void f1(){
        print("First f1()");
        f2();
    }
    void f2(){
        print("First f2()");
    }
}
class Second extends First{
    void f2(){
        print("Second f2()");
    }
}
public class P10 {
    public static void main(String[] args) {
        Second second=new Second();
        second.f1();
        new First();
    }
}
