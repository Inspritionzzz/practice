package com.bupt.thinkinjava.c3;

import static com.bupt.utils.Print.print;

/**
 * 移位
 */

public class P11 {
    public static void main(String[] args) {
        int num1=0xf;
        print(Integer.toBinaryString(num1));
        print(Integer.toBinaryString(num1>>1));
        print(Integer.toBinaryString(num1>>2));
        print(Integer.toBinaryString(num1>>3));


    }
}
