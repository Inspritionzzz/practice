package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

class Outter{
    private static int count=1;
    private int id=count++;
    private int i=233;
    private void f1(){
        print("");
    }

    class Inner{
        public int getId(){
            return id;
        }
        public int setI(){
            return ++i;
        }
    }
    Inner f2(){
        return new Outter().new Inner();
        //this.getCount();
    }
    int f3(){
        Inner inner=new Inner();
        return inner.setI();
    }

    public static int getCount() {
        return count;
    }
}
public class P7 {
    public static void main(String[] args) {
        Outter outer=new Outter();
        for(int i=0;i<3;i++){
            outer.f2();
        }
        print(outer.getCount());
        print(outer.f3());
    }
}
