package com.bupt.thinkinjava.c5;

class StaticInitialization{
    static String str1="s1";
    static String str2;

    static {
        str2="s2";
    }

    static void printStr(){
        System.out.println(str1);
        System.out.println(str2);
    }
}
public class P14 {
    public static void main(String[] args) {
        StaticInitialization.printStr();
    }
}
