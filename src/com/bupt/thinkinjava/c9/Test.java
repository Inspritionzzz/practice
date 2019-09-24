package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

class Test4{
    void f1(){
        print(this);
    }

    public String toString() {
        return "Test4";
    }

    public void print1(String str){
        print(str);
    }
}
class Test5 extends Test4 {

    public String toString() {
        return "Test5";
    }

    @Override
    public void print1(String str) {
        super.print1(str);
    }
}
public class Test {
    public static void main(String[] args) {
        Test4 test5=new Test5();
        test5.f1();
    }
}
