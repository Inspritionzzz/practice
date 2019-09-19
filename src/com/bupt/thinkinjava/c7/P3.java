package com.bupt.thinkinjava.c7;

/**
 * 证明继承的构建过程是扩散性的；
 */

class A{
    A(){
        System.out.println("AAAAAAA");
    }
}

class B extends A{
    B(){
        System.out.println("BBBBBBB");
    }
}
class C extends B{
    C(){
        System.out.println("CCCCCCC");
    }
}
public class P3 {
    public static void main(String[] args) {
        C c=new C();
    }
}
