package com.bupt.thinkinjava.c7;

/**
 * 测试继承时类的初始化；
 */

class AA{
    AA(){
        System.out.println("创建AA");
    }
}
class BB{
    BB(){
        System.out.println("创建BB");
    }
}
class CC extends AA{
    BB bb=new BB();
}
public class P5 {
    public static void main(String[] args) {
        new CC();
    }
}
