package com.bupt.thinkinjava.c10;

import com.bupt.thinkinjava.simple.c10_P6;

class Test1{

    protected class InnerTest1 implements c10_P6 {
        @Override
        public void f1() {

        }

        public InnerTest1(){
            System.out.println("InnerTest1");
        }
    }
}
class Test2 extends Test1{

    protected c10_P6 f1(){
        return new InnerTest1();
    }
}
public class P6 {
    public static void main(String[] args) {
        Test2 test2=new Test2();
        c10_P6 t=test2.f1();
    }
}
