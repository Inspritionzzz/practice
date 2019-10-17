package com.bupt.thinkinjava.c11;

import java.util.*;

import static com.bupt.utils.Print.print;

/**
 * List API练习；
 * 修改ListFeature.java,使用integer而不是Pet；
 *
 */
public class P5 {
    public static void main(String[] args) {

        Random random=new Random(47);

        List<Integer> list01=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7));
        print("1:"+list01);

        Integer i=new Integer(3);
        list01.add(i);
        print("2:"+list01);

        print("3:"+list01.contains(i));

        list01.remove(i);
        print("list01:"+list01);
        Integer ii=list01.get(2);
        print("4:"+ii+" "+list01.indexOf(ii));

        Integer iii=new Integer(3);
        print("5:"+list01.indexOf(iii));

        print("6:"+list01.remove(iii));

        print("7:"+list01.remove(ii));

        print("8:"+list01);

        list01.add(3,new Integer(3));
        print("9:"+list01);

        List<Integer> subList01=new ArrayList<Integer>();
        subList01=list01.subList(1,4);
        print("subList01:"+subList01);

        print("10:"+list01.containsAll(subList01));

        Collections.sort(subList01);
        print("sort subList01:"+subList01);

        print("11:"+list01.containsAll(subList01));

        Collections.shuffle(subList01,random);
        print("shuffle sublist01:"+subList01);

        print("12:"+list01.containsAll(subList01));

        print("list01:"+list01);

        subList01=Arrays.asList(list01.get(1),list01.get(4));
        print("sort subList01:"+subList01);

        List<Integer> copy=new LinkedList<>(list01);
        copy.retainAll(subList01);
        print("13:"+copy);

        copy=new LinkedList<>(list01);
        copy.remove(2);
        print("14:"+copy);

        copy.removeAll(subList01);
        print("15:"+copy);

        copy.set(1,new Integer(3));
        print("16:"+copy);

        copy.addAll(2,subList01);
        print("17:"+copy);

        print("18:"+list01.isEmpty());

        list01.clear();;
        print("19:"+list01);

        print("20:"+list01.isEmpty());

        list01.addAll(Arrays.asList(1,2,3,4));
        print("21:"+list01);

        Object[] objects=list01.toArray();//列表转换成数组；
        print("22:"+objects[3]);

        Integer[] integers=list01.toArray(new Integer[3]);//列表转换成数组的同时还能够添加对象；
        print("23:"+integers[1]);
        //print(integers);
        for(int j=0;j<integers.length;j++){
            print(integers[j]);
        }



    }
}
