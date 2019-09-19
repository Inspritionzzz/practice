package com.bupt.thinkinjava.c3;

import static com.bupt.utils.Print.print;

/**
 * 使用八进制、十六进制计数法操作long类型
 */

public class P8 {
    public static void main(String[] args) {
        long num1=0xffffL;
        long num2=07777L;
        print(Long.toBinaryString(num1));
        print(Long.toBinaryString(num2));
    }
}
