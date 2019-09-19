package com.bupt.thinkinjava.c5;

public class P2 {

    String str1="test1";

    P2(String str){
        System.out.println(str);
    }

    public static void main(String[] args) {
        P2 p2=new P2("test2");
        System.out.println(p2.str1);
    }
}
