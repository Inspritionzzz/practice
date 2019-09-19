package com.bupt.thinkinjava.c6;

class TestAcess{

    public String str1;
    protected String str2;
    String str3;
    private String str4;


    public void f1(){
        System.out.println("f1");
    }
    protected void f2(){
        System.out.println("f2");
    }
    void f3(){
        System.out.println("f3");

    }
    private void f4(){
        System.out.println("f4");

    }
}

public class P5 {
    public static void main(String[] args) {
        TestAcess testAcess=new TestAcess();
        testAcess.str1="ss";
        testAcess.str2="ss";
        testAcess.str2="ss";
        //testAcess.str4  无法访问str4

        testAcess.f1();
        testAcess.f2();
        testAcess.f3();
        //testAcess.f4  无法访问f4


    }
}
