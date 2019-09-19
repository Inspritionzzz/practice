package com.bupt.thinkinjava.c4;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

/**
 * 斐波那契数列
 */

public class P9 {

    static int Fibonacci(int count){
       if(count==1||count==2){
           return 1;
       }
       int[] array=new int[count+2];
       array[0]=1;
       array[1]=1;
       for(int i=0;i<count;i++){
            array[i+2]=array[i+1]+array[i];
       }
       for(int i=0;i<count;i++){
           printnb(array[i]+" ");

       }
        print();

       return array[count-1];
    }
    public static void main(String[] args) {
        print(Fibonacci(7));

    }
}
