package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * new一个其他类的内部类时要加上修饰；
 */
class Outter02{
    class Inner01{
        public Inner01(){
            print("new Inner01");
        }
    }

    void f(){
        //添加修饰；
        P18.Inner02 p=new P18.Inner02();
    }
}
public class P18 {

    static class Inner02{
        public Inner02(){
            print("new Inner02");
        }
    }

    public static void main(String[] args) {
        Outter02 outter02=new Outter02();
        outter02.new Inner01();
        outter02.f();
    }
}
