package com.bupt.thinkinjava.c4;

import static com.bupt.utils.Print.print;
import static jdk.nashorn.internal.objects.Global.println;

public class P6 {
    static int test(int begin,int end,int num){
        if(begin>end){
            System.out.println("输入错误");
        }
        if(num<begin||num>end){
            return 0;
        }else{
            return 1;
        }

    }

    public static void main(String[] args) {
//        int[] array=new int[10];
//        for (int a:array){
//            System.out.println(a);
//        }
        print(test(5,10,8));


    }
}
