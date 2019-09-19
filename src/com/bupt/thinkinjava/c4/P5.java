package com.bupt.thinkinjava.c4;

import static com.bupt.utils.Print.print;

public class P5 {

    static void toBinaryString(int num){
        char[] buffer=new char[32];
        int bufferPosition=buffer.length;
        while(num!=0){
            buffer[--bufferPosition]=((num & 0x01) == 1 ? '1':'0');
            num>>=1;
        }
        for(int i=0;i<buffer.length;i++){
            System.out.print(buffer[i]);
        }
        print();
    }
    public static void main(String[] args) {

        int num1=0xAA;
        int num2=0x55;
        System.out.println("正确的二进制表示：");
        System.out.println("num1="+Integer.toBinaryString(num1));
        System.out.println("新版的二进制表示：");
        toBinaryString(num1);

        System.out.println("num2="+Integer.toBinaryString(num2));
        toBinaryString(num2);




    }
}
