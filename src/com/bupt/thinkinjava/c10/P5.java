package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 内部类不能被其他外部类访问；
 */
class Outer2{
    class Inner2{
        Inner2(){
            print("创建了Inner2");
        }
    }

    Inner2 getInner2(){
        return new Inner2();
    }
}
class Outer3{

    public static Outer2.Inner2 getInner2(){
        Outer2 outer2=new Outer2();
        return outer2.getInner2();
    }

}
public class P5 {
    public static void main(String[] args) {
        Outer2.Inner2 inner2=Outer3.getInner2();
    }
}
