package com.bupt.thinkinjava.c7;

import static com.bupt.utils.Print.print;

/**
 * 加载static修饰的域仅发生一次，new对象或者访问static成员都会引起加载；
 */

class Test1{
    static  int i=0;
//    Test1(){
//        print("加载Test1...");
//    }
    static {
        System.out.println("加载Test1");
}
    static void staticFunction(){
        System.out.println("sss");
    }
}

public class P23 {
    public static void main(String[] args) {
            //new Test1();
        //print(Test1.i);
        Test1.staticFunction();
        Test1 test1=new Test1();
    }
}
