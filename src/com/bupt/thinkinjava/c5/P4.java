package com.bupt.thinkinjava.c5;

public class P4 {

    P4(){
        System.out.println("11111");
    }

    P4(String str){
        System.out.println(str);
    }
    public static void main(String[] args) {
        P4 p3=new P4("skr");
        new P4();
    }
}