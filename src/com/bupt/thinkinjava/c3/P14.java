package com.bupt.thinkinjava.c3;

import static com.bupt.utils.Print.print;

/**
 * 比较字符串,== ！= equals的差异；
 */

public class P14 {
    static void compare(String s1,String s2){
        print("==:"+s1==s2);
        print("!=:"+s1!=s2);
        print("equals:"+s1.equals(s2));
    }
    public static void main(String[] args) {
        //s2 = s2.intern();
        String s1="test";
        String s2="test";
        //print(s1=s2);
        String s3=s1;
        compare(s1,s2) ;
        print("++++++++");
        compare(s1,s3);
    }
}
