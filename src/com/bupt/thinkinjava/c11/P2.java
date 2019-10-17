package com.bupt.thinkinjava.c11;
//: holding/SimpleCollection.java
import java.util.*;

public class P2{
    public static void main(String[] args) {
        //Collection<Integer> c = new ArrayList<Integer>();
        Collection<Integer> c=new HashSet<>();
        for(int i = 0; i < 10; i++)
            c.add(i); // Autoboxing
        for(Integer i : c)
            System.out.print(i + ", ");
    }
} /* Output:
0, 1, 2, 3, 4, 5, 6, 7, 8, 9,
*///:~
