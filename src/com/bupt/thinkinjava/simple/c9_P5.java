package com.bupt.thinkinjava.simple;

import com.bupt.thinkinjava.c9.P5;

import static com.bupt.utils.Print.print;

class P5Impl implements P5 {
    @Override
    public void f1() {
        print(1);
    }

    @Override
    public void f2() {
        print(2);
    }

    @Override
    public void f3() {
        print(3);
    }
}
public class c9_P5 {
    public static void main(String[] args) {
        P5Impl p5=new P5Impl();
        p5.f1();
        p5.f2();
        p5.f3();
        P5 p51=new P5Impl();
        p51.f1();
        p51.f2();
        p51.f3();
    }
}
