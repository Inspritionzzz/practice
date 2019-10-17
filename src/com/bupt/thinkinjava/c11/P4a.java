package com.bupt.thinkinjava.c11;

import java.util.*;

import static com.bupt.utils.Print.print;

/**
 * 使用Collection接口简化P4的实现；
 */
public class P4a {
    private static MovieNameGenerator movieNameGenerator=new MovieNameGenerator();

    static Collection<String> fill(Collection<String> collection){
        for(int i=0;i<7;i++){
            collection.add(movieNameGenerator.next());
        }
        return collection;
    }

    static String[] fill(String[] array){
        for(int i=0;i<array.length;i++){
            array[i]=movieNameGenerator.next();
        }
        return array;
    }
    public static void main(String[] args) {
        print(Arrays.toString(fill(new String[5])));
        print(fill(new ArrayList<>()));
        print(fill(new LinkedList<>()));
        print(fill(new HashSet<>()));
        print(fill(new LinkedHashSet<>()));
        print(fill(new TreeSet<>()));

    }
}
