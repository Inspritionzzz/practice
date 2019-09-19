package com.bupt.thinkinjava.c4;

/**
 *产生素数
 */

public class P4 {

//    static void printNum(){
//        int n=2;
//        if(n==2){
//            System.out.println(n+" ");
//            n++;
//        }
//        for(int m=2;m<n+1;m++){
//            if(n%m==0){
//                n++;
//                break;
//            }
//            else{
//                System.out.print(m+" ");
//                n++;
//                break;
//            }
//        }
//    }

    public static void main(String[] args) {
        for(int n=2;n<100;n++){
            if(n==2){
                System.out.print(n+" ");
            }
            for(int m=2;m<n;m++){
                if(n%m==0)
                    break;
                else
                    System.out.print(n+" ");
                    break;
            }
        }

//        printNum();
    }
}
