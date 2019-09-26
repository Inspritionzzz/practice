package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 内部类可以直接访问外部类的域（即使是私有的）；
 */
class Outer1{
    private String string;
    Outer1(String string){
        this.string=string;
    }

    Inner1 getInner(){
        return new Inner1();
    }
    class Inner1{
        @Override
        public String toString() {
            return string;
        }
    }
}
public class P3 {
    public static void main(String[] args) {
        Outer1 outer1=new Outer1("3");
        Outer1.Inner1 inner1=outer1.getInner();
        print(inner1.toString());
    }
}
