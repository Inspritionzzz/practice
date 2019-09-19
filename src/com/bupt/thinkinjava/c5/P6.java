package com.bupt.thinkinjava.c5;

/**
 * 方法的重载
 */

class CrisWu2{

    void skr(int i,double j){
        System.out.println("int"+"double");
    }

    void skr(double j,int i){
        System.out.println("double"+"int");
    }


}

public class P6 {

    public static void main(String[] args) {
        CrisWu2 crisWu2=new CrisWu2();
        crisWu2.skr(1,1.0);
        crisWu2.skr(1.0,1);
    }
}
