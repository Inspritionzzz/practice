package com.bupt.thinkinjava.c5;

/**
 * 构造器中调用构造器；
 */

class  A{



    A(String str){
          System.out.println("第一个："+str);
    }

    A(int i){
          this("第二个："+i);
        //System.out.println("第一个："+"第二个"+i);
    }


}
public class P9 {
    public static void main(String[] args) {
        A a=new A("sss");
        A aa=new A(333);
    }
}
