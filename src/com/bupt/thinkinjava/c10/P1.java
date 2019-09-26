package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

class Outer{

    Inner getInner(){
        return new Inner();
    }

    class Inner{
        Inner(){
            print("Inner initial");
        }
    }
}
public class P1 {
    public static void main(String[] args) {
        Outer outer=new Outer();
        Outer.Inner inner=outer.getInner();
    }
}
