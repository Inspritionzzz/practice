package com.bupt.thinkinjava.c7;
class A1{
    String str;
    A1(String string){
        this.str=string;
    }

//    A1(){
//
//    }
}
class B1 extends A1{

    B1(){
       //System.out.println("默认构造器执行了");
        super("test");
    }

    B1(String string){
        super(string);
        System.out.println("非默认构造器执行了");
    }
}
public class P8 {
    public static void main(String[] args) {
        new B1();
        new B1("HAHAHA");
    }
}
