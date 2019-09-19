package com.bupt.thinkinjava.c4;

import java.util.Scanner;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

public class P9a {
    static int Fibonacci(int n){
        if(n<=2){
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        print("输入一个大于0的整数：");
        int n=scanner.nextInt();
        if(n<1){
            print("输都能输歪来？");
        }
        print(Fibonacci(n));
        for(int i=1;i<10;i++){
            printnb(Fibonacci(i)+" ");
        }
    }
}
