package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

class Outter03{
     private class Inner implements C10_P9{
        @Override
        public void f1() {
            print("Outter03.Inner");
        }
    }
     C10_P9 getInner(){
        return new Inner();
    }

    Inner getInner02(){
        return new Inner();
    }

}
public class P11 {
    public static void main(String[] args) {
        Outter03 outter03=new Outter03();
        C10_P9 c10_p9=outter03.getInner();
        c10_p9.f1();
        C10_P9 c10_p91=outter03.getInner02();
        c10_p91.f1();
        //如果内部类没有private修饰，在外部可以访问；如果使用private修饰，则内部类对外是透明的
//        Outter03.Inner inner=outter03.getInner02();
//        inner.f1();

    }
}
