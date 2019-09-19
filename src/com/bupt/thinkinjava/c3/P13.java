package com.bupt.thinkinjava.c3;

import static com.bupt.utils.Print.print;

/**
 * 二进制显示char类型；
 */

public class P13 {
    public static void main(String[] args) {
        char c='A';
        print(Integer.toBinaryString(c));
        print(Integer.toBinaryString('!'));
    }
}
