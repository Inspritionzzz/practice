package com.bupt.thinkinjava.c3;

import static com.bupt.utils.Print.print;

/**
 *
 */

public class P10 {
    static int NUM1=0xA;//低位为1；
    static int NUM2=0x5;//低位为0；
    public static void main(String[] args) {
        //print(Long.toBinaryString(NUM1));

        print(Integer.toBinaryString(NUM1&NUM2));
        print(Integer.toBinaryString(NUM1|NUM2));
        print(Integer.toBinaryString(NUM1^NUM2));
        print(Integer.toBinaryString(~NUM1));
        print(Integer.toBinaryString(~NUM2));

    }
}
