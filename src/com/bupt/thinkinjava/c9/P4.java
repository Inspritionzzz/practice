package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

abstract class WithNoMethod{

}
class Extend1 extends WithNoMethod{
    void f1(){
        print("Extend1.f1()");
    }
}
abstract class WithMethod{
    abstract void f1();
}
class Extend2 extends WithMethod{
    @Override
    void f1() {
        print("Extend2.f1()");
    }
}
public class P4 {
    public static void test1(WithNoMethod withNoMethod){
        ((Extend1)withNoMethod).f1();
    }
    public static void test2(WithMethod withMethod){
        withMethod.f1();
    }
    public static void main(String[] args) {
        //P4.test1();
        //P4.test2();
        WithNoMethod withNoMethod=new Extend1();
        test1(withNoMethod);
        WithMethod withMethod=new Extend2();
        test2(withMethod);
    }
}
