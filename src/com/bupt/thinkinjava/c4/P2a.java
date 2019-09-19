package com.bupt.thinkinjava.c4;

import java.util.Random;

import static com.bupt.utils.Print.print;

public class P2a {
    static void compareRand(){
        Random random=new Random();
        int a=random.nextInt(100);
        int b=random.nextInt(100);
        print("a="+a+" "+"b="+b);
        if(a>b){
            print("a>b");
        }else if (a<b){
            print("a<b");
        }else {
            print("a=b");
        }
    }
    public static void main(String[] args) {
        for(int i=1;i<26;i++){
            compareRand();
        }
    }

}
