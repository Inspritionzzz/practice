package com.bupt.thinkinjava.c3;

import static com.bupt.utils.Print.print;

/**
 * 方法调用时的别名机制:给一个函数传入引用会影响域中的值
 */

class Letter{
    float aFloat;
}

public class P3 {
    static void f(Letter letter){
        letter.aFloat=1.0f;
    }

    public static void main(String[] args){
        Letter letter=new Letter();
        letter.aFloat=2.0f;
        print("函数调用前："+letter.aFloat);

        f(letter);
        print("函数调用后："+letter.aFloat);
    }
}
