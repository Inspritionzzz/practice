package com.bupt.thinkinjava.c5;


class TestFinalize{

    boolean flag=true;
    void f1(){
        this.flag=false;
    }

    TestFinalize(){
        this.flag=true;
    }
    protected void finalize(){
        if(!flag)
            System.out.println("Error!");
    }
}
public class P10_P11 {
    /*void finalize1(){
        System.out.println("11111");
    }*/
    public static void main(String[] args) {
        //TestFinalize testFinalize=new TestFinalize();
        //testFinalize.f1();
        //testFinalize.finalize();

        new TestFinalize();
        new TestFinalize().f1();
        new TestFinalize().f1();
        System.gc();
        System.runFinalization();
    }
}
