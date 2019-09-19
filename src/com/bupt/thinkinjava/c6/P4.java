package com.bupt.thinkinjava.c6;

public class P4 {

    public static void main(String[] args) {
        TestProtected testProtected=new TestProtected();
        testProtected.f1();//可以访问在同一包下的f1方法；
        com.bupt.thinkinjava.simple.TestProtected testProtected1=
                new com.bupt.thinkinjava.simple.TestProtected();
        //testProtected1.f1();不能访问在另一个包下的f1方法；
    }
}
