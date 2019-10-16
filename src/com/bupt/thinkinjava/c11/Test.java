package com.bupt.thinkinjava.c11;


import static com.bupt.utils.Print.print;

public class Test {
    static String strChange(String string){
        return string.toUpperCase();
    }
    public static void main(String[] args) {
        String s1="aaa";
        String s2=Test.strChange(s1);
        print("s1:"+s1);
        print("s2:"+s2);
    }
}
