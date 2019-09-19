package com.bupt.thinkinjava.c7;

/**
 * 测试方法的重载；
 */
class Test{
    String string;
    int anInt;
    char aChar;

    void f1(int i){

    }

    void f1(String s){

    }

    void f1(char c){

    }
}

class Test2 extends Test{

    void f1(int i,int j){

    }

}
public class P13 {
    public static void main(String[] args) {
        Test2 test2=new Test2();
        test2.f1(1,3);
        test2.f1(1);
        test2.f1("sss");
        test2.f1('a');
    }
}
