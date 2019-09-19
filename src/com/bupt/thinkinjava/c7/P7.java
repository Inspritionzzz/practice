package com.bupt.thinkinjava.c7;

class AAA{
    AAA(String string){
        System.out.println("创建了AAA的对象"+string);
    }
}
class BBB{
    BBB(String string){
        System.out.println("创建了BBB的对象"+string);
    }
}

class CCC extends AAA{
    BBB bbb;
    CCC(){
        super("AAAA");
        new BBB("BBBB");
        System.out.println("创建了CCC的对象");
    }
}
public class P7 {
    public static void main(String[] args) {
        new CCC();
    }
}
