package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

/**
 * 即使抽象类不包含抽象方法，也无法直接实例化；
 */
abstract class Test1{
    void f(){
        print("1111111");
    }
}

public class P2 {
    public static void main(String[] args) {
        //编译错误
        //new Test1();
    }
}
