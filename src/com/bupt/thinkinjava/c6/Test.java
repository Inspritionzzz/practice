package com.bupt.thinkinjava.c6;

import static com.bupt.utils.Print.print;

class Aa{

    void f1(){

    }
    private Aa(){}
}

class TestStatic{
    private static int count1=0;
    private  int count2=count1++;
    //private static int countx=0;
    //private final int count2=count1++;
    //private int count2=count1++;

    //private int count3=1;
    public int getCount1() {
        return count1;

    }

    public int getCount2() {
        return count2;
    }
}
public class Test {

        private static int a=1;
        private static int b=a;

    public static void main(String[] args) {
        //Aa a=new Aa();
        TestStatic testStatic1=new TestStatic();
        print(testStatic1.getCount1());
        print(testStatic1.getCount2());

        TestStatic testStatic2=new TestStatic();
        print(testStatic2.getCount1());
        print(testStatic2.getCount2());

        TestStatic testStatic3=new TestStatic();
        print(testStatic3.getCount1());
        print(testStatic3.getCount2());


    }
}
