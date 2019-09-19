package com.bupt.thinkinjava.c4;

import static com.bupt.utils.Print.print;

public class P7 {
    public static void main(String[] args) {
        for(int i=1;i<101;i++){
            if(i==100)
                break;
            System.out.print(i+" ");
        }

        print();
        for(int i=1;i<101;i++){
            if(i==100)
                return;
            System.out.print(i+" ");
        }
    }
}
