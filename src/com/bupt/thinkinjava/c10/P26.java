package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 *
 * ① 写一个类继承另一个类的内部类；
 * ② 写一个内部类继承另一个类的内部类；
 * 这两个类的构造器都需要传入内部类所在外部类的引用，并且构造器的其他参数需要与继承的内部类的构造器的参数保持一致,
 * 并且需要调用父类的构造器；
 * ③在main方法中创建这两个类的对象；
 */


class Outter05{
    class Inner05{
        private String string;
        public Inner05(String string,int i){
            this.string=string;
            print("new Inner05");
        }
    }
}

class Outter06 extends Outter05{
    //Outter05 outter05=new Outter05();

//    public Outter06(Outter05 outter05) {
//        outter05.super();
//    }

    class Inner06 extends Outter05.Inner05 {
        private String string;
        public Inner06(Outter05 outter05,String string,int i){
            //this.string=string;
            outter05.super(string,i);
            print("new Inner06");
        }
    }
}

class Inner07 extends Outter05.Inner05{
    public Inner07(Outter05 outter05,String string, int i) {
        outter05.super(string, i);
        print("new inner07");
    }
}
public class P26 {
    public static void main(String[] args) {
        Outter05 outter05=new Outter05();
        //Outter06.Inner06 Innner06=new Outter06.Inner06(outter05,"aaa",333);
        Outter06 outter06=new Outter06();
        Outter06.Inner06 inner06=outter06.new Inner06(outter05,"aaa",333);
        Inner07 inner07=new Inner07(outter05,"aaa",222);
    }
}
