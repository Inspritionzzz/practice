package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

interface I1{
    void f();
}
interface I2 extends I1{
    void f();
}
interface I3 extends I1{
    void f();
}
interface I4 extends I2,I3{
    void f();
}
class Test8 implements I4{
   public void f(){
       print("111111");
   }

}
public class P13 {
    public static void main(String[] args) {
        Test8 test8=new Test8();
        test8.f();
    }
}
