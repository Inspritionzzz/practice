package com.bupt.thinkinjava.c5;

/**
 * this关键字的作用；
 */

class test{
    void f1(){
        //System.out.println("f1");
        f2();
        this.f2();
    }
    void f2(){
        System.out.println("f2被调用了");
    }
}
public class P8 {

    public static void main(String[] args) {
        test t=new test();
        t.f1();
    }
}
