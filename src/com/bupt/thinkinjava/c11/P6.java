package com.bupt.thinkinjava.c11;


import java.util.*;

import static com.bupt.utils.Print.print;

/**
 * List API练习；
 * 修改ListFeature.java,使用String而不是Pet；
 *
 */
public class P6 {
    public static void main(String[] args) {
        Random random=new Random();
        List<String> strs01=new ArrayList<String>(Arrays.asList("A","B","C","D","E","F","G"));
        print("1:"+strs01);

        String s1=new String("H");
        strs01.add(s1);
        print("2:"+strs01);

        print("3:"+strs01.contains(s1));

        strs01.remove(s1);
        print("strs01:"+strs01);

        String s2=strs01.get(2);
        print("4:"+s2+" "+strs01.indexOf(s2));

        String s3=new String("H");
        strs01.add(s3);
        print("strs01:"+strs01);
        print("5:"+strs01.indexOf(s3));
        print("6:"+strs01.remove(s3));

        print("7:"+strs01.remove(s2));
        print("8:"+strs01);

        strs01.add(3,"C");
        print("9:"+strs01);

        List<String> subList=strs01.subList(1,4);
        print("subList:"+subList);

        print("10:"+strs01.containsAll(subList));



    }
}
