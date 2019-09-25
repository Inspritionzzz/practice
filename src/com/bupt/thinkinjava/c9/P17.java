package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

interface StaticFinalTest{
    int count=233;
    //void setCount(int count);
}
class Test12 implements StaticFinalTest{

    public void setCount() {
        //this.count=count;
        //count++;
    }
    Test12(){
        setCount();
    }
}
public class P17 {
    public static void main(String[] args) {
        print(StaticFinalTest.count);

    }
}
