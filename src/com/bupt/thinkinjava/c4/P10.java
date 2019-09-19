package com.bupt.thinkinjava.c4;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

public class P10 {
    static void luckeyNum(){
        for(int i=1000;i<10000;i++){
                int[] array=new int[4];
                int arrayBuffer=array.length-1;
                int num=i;
                while(num!=0){
                    array[arrayBuffer--]=num%10;
                    num=num/10;
                }

            }
        }

    public static void main(String[] args) {
        luckeyNum();
        //print(1001/100);
    }
}
