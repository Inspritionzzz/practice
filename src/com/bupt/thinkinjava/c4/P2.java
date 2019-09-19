package com.bupt.thinkinjava.c4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static com.bupt.utils.Print.print;

/**
 * 比较相邻的随机整数（与后面的比较），按照<,>,=进行分类；
 */

public class P2 {
    public static void main(String[] args) {
        Random random=new Random();
//        int num1=random.nextInt(100);
//        int num2=random.nextInt(100);
        int count1=0;
        int count2=0;
        int count3=0;
        int[] array=new int[30];
        int[] array1=new int[30];
        int[] array2=new int[30];
        int[] array3=new int[30];
        for(int i=0;i<26;i++){
            array[i]=random.nextInt(100);
        }
        for(int i=0;i<26;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println("====");
        for(int i=0;i<26;i++){
            if(array[i+1]>array[i]){
                //System.out.print(array[i]+" ");
                array1[count1]=array[i];
                count1++;
            }else if(array[i+1]<array[i]){
                //System.out.print(array[i]+" ");
                array2[count2]=array[i];
                count2++;
            }else{
                System.out.print(array[i]+" ");
                array3[count3]=array[i];
                count3++;
            }

        }

        for(int i=0;i<count1;i++){
            System.out.print(array1[i]+" ");

        }
        System.out.println("====");
        for(int i=0;i<count2;i++){
            System.out.print(array2[i]+" ");

        }
        System.out.println("====");
        for(int i=0;i<count3;i++){
            System.out.print(array3[i]+" ");

        }
        System.out.println("====");
    }
}
