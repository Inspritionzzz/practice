package com.bupt.thinkinjava.c5;

/**
方法的重载
 */
class CrisWu{

    void bark(String str){
        System.out.println(str);
    }

    void bark(int i){
        System.out.println(i);
    }
}
public class P5 {
    public static void main(String[] args) {
        CrisWu crisWu=new CrisWu();
        crisWu.bark(333);
        crisWu.bark("skrskr");
    }
}
