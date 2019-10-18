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

        Collections.sort(subList);
        print("subList:"+subList);
        print("11:"+strs01.containsAll(subList));

        Collections.shuffle(subList,random);
        print("subList:"+subList);
        print("12:"+strs01.containsAll(subList));

        List<String> copy=new LinkedList<>(strs01);
        print("copy:"+copy);

        subList=Arrays.asList(strs01.get(1),strs01.get(4));
        print("subList:"+subList);

        copy.retainAll(subList);
        print("13:"+copy);

        copy=new ArrayList<>(strs01);
        print("copy:"+copy);
        copy.remove(1);
        print("13:"+copy);

        copy.add(1,"C");
        copy.remove(subList);
        print("14:"+copy);
        copy.removeAll(subList);
        print("15:"+copy);

        copy.set(0,"C");
        print("16:"+copy);

        copy.addAll(3,subList);
        print("17:"+copy);

        print("18:"+copy.isEmpty());
        copy.clear();
        print("19:"+copy);
        print("20:"+copy.isEmpty());

        copy.addAll(Arrays.asList("A","B","C","D"));
        print("21:"+copy);

        Object[] objects=copy.toArray();
        print("22:"+objects[0]);

        String[] strings=copy.toArray(new String[0]);
        print("23:"+strings[1]);
    }
}
