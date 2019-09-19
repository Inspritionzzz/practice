package com.bupt.thinkinjava.c4;

import java.util.Random;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

public class P8 {
    public static void main(String[] args) {
        Random random=new Random();
        for(int i=0;i<100;i++){
            int c=random.nextInt(26)+'A';
            printnb((char)c+"  "+c+"  ");
            switch (c){
                case 'A':
                case 'B':
                case 'C':
                case 'D':   print("HAHAHA");
                    break;

                case 'X':
                case 'Y':
                case 'Z':   print("HEYHEY");
                    break;

                default:    print("XIXIXI");
                    break;
            }


        }


    }
}
