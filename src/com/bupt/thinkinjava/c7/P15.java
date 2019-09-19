package com.bupt.thinkinjava.c7;

import static com.bupt.utils.Print.print;

class TestProtect1{
    protected void f1(){
        print("protected method");
    }
}
class TestProtect2 extends TestProtect1{
     void f2(){
        print("f2内调用f1");
        super.f1();
    }
}
public class P15 {
    public static void main(String[] args) {
        TestProtect1 testProtect1=new TestProtect1();
        testProtect1.f1();
        TestProtect2 testProtect2=new TestProtect2();
        testProtect2.f2();
    }
}
