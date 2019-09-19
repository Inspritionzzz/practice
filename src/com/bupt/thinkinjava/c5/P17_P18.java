package com.bupt.thinkinjava.c5;

import java.util.Random;

class TestArrayInitialization{

    TestArrayInitialization(String str){
        System.out.println(str);
    }
}
public class P17_P18 {
    public static void main(String[] args) {
        Random random=new Random(47);
        TestArrayInitialization[] testArrayInit=new TestArrayInitialization[random.nextInt(20)];
        //testArrayInit[0]=new TestArrayInitialization("test1");
        for(int i=0;i<testArrayInit.length;i++){
            if(i%2==0){
                testArrayInit[i]=new TestArrayInitialization("aaa");

            }else{
                testArrayInit[i]=new TestArrayInitialization("bbb");
            }

        }
    }
}
