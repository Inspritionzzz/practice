package com.bupt.thinkinjava.c5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class P16 {
    public static void main(String[] args) {
        String[] strings=new String[]{
                "test1",
                "test2"
        };

        System.out.println(Arrays.toString(strings));

        for(int i=0;i<strings.length;i++){
            System.out.println(strings[i]);
        }

    }
}
