package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 内部类可以随意访问外部类的域和方法，即使它们是被private修饰的；
 * 这里使用内部类的方式；
 *
 */
class Outter04{
    private int i;
    void getI(){
        print(this.i);

    }

    public void innerChange(){
         new Object(){
            void change(){
                ++i;
                //System.out.println(i);
                getI();
            }
        }.change();
    }
}
public class P12 {
    public static void main(String[] args) {
        Outter04 outter04=new Outter04();
        outter04.getI();
        outter04.innerChange();
        outter04.innerChange();
        outter04.getI();
    }
}
