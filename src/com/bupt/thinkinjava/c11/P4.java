package com.bupt.thinkinjava.c11;

import java.util.*;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;
class MovieNameGenerator implements Generator<String>{

    String[] characters = {
            "Grumpy", "Happy", "Sleepy", "Dopey", "Doc", "Sneezy",
            "Bashful", "Snow White", "Witch Queen", "Prince"
    };

    int next;
    @Override
    public String next() {
        String r=characters[next];
        next=(next+1)%characters.length;
        return r;
    }
}
public class P4 {
    public static void main(String[] args) {
        MovieNameGenerator movieNameGenerator=new MovieNameGenerator();
        MovieNameGenerator movieNameGenerator1=new MovieNameGenerator();
        //1 ArrayList；
        List<String> list=new ArrayList<>();
        for(int i=0;i<5;i++){
            list.add(movieNameGenerator.next());
            //printnb(list.get(i)+" ");
        }
//        for (String s:list
//             ) {
//            printnb(s+",");
//        }
        print(list);
        print();
        //2 LinkedList
        List<String> list02=new LinkedList<>();
        for(int i=0;i<5;i++){
            list02.add(movieNameGenerator.next());
            //printnb(list02.get(i)+" ");
        }
        for (String s:list02
        ) {
            printnb(s+",");
        }
        print();

        //3 HashSet
        Set<String> set1=new HashSet<>();
        for(int i=0;i<5;i++){
            set1.add(movieNameGenerator.next());
        }
        for (String s:set1
             ) {
            printnb(s+",");
        }
        print();

        //4 LinkedhashSet
        Set<String> set2=new LinkedHashSet<>();
        for(int i=0;i<5;i++){
            set2.add(movieNameGenerator.next());
        }
        for (String s:set2
        ) {
            printnb(s+",");
        }
        print();

        //5 TreeSet
        Set<String> set3=new TreeSet<>();
        for(int i=0;i<5;i++){
            set3.add(movieNameGenerator.next());
        }
        for (String s:set3
        ) {
            printnb(s+",");
        }





    }
}
