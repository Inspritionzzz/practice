package com.bupt.thinkinjava.c5;

import java.util.Arrays;

import static com.bupt.utils.Print.print;

/**
 * 可变参数列表，使用foreach输出；
 */
class MyPrint{
    static void print(String...args){
        for (String str:args
             ) {
            System.out.print(str+"  ");
        }
        System.out.println();

    }
}
public class P19 {
    public static void main(String[] args) {
        MyPrint print=new MyPrint();
        print.print("111","222","333");
        print.print(new String[]{
                "444",
                "555",
                "666",
        });

    }
}
