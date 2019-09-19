package com.bupt.thinkinjava.c3;

import java.util.Random;

import static com.bupt.utils.Print.print;

/**
 * 模拟扔硬币的结果；
 */

public class P7 {
    static String M="正";
    static String N="反";

    public static void main(String[] args) {

        int count=100000;
        int count1=0;//统计正面
        int count2=0;//统计反面
        Random random=new Random();
        while (count>0){

            int i=random.nextInt(10);

            if(i<5){
                //System.out.println(M);
                count1++;
            }else {
                //System.out.println(N);
                count2++;
            }

            count--;
        }

        print("正面次数："+count1+"+++++"+"反面次数："+count2);

        Boolean flag;
        flag=random.nextBoolean();
        System.out.println(flag);




    }
}
