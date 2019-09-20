package com.bupt.thinkinjava.c10;
class WithInner{
    WithInner(){
        System.out.println("外围类的构造器");
    }
    class Inner{
        Inner(){
            System.out.println("内部类的构造器");
        }
    }
}
class MyInner extends WithInner.Inner {
    MyInner(WithInner withInner){
        withInner.super();
    }
}
public class Test {
    public static void main(String[] args) {
        new MyInner(new WithInner());
    }
}
