package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 验证外部类能访问内部类的private方法；
 */
class Outter01{
    class Inner01{

        private  String str="from Inner01";
    }
    public Outter01(){
        Inner01 inner01=new Inner01();
        print(inner01.str);
    }

    public void displayInner(){
        Inner01 inner01=new Inner01();
        print(inner01.str);
    }
}
public class P8 {
    public static void main(String[] args) {
        Outter01 outter01=new Outter01();
        outter01.displayInner();
    }
}
