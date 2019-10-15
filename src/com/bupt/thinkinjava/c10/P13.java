package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 使用匿名内部类实现接口
 */
public class P13 {

    public static C10_P9 getC10_P9(){
        return new C10_P9(){
            @Override
            public void f1() {
                print("from 匿名内部类");
            }
        };
    }
    public static void main(String[] args) {
        C10_P9 c10_p9=P13.getC10_P9();
        c10_p9.f1();
    }

}