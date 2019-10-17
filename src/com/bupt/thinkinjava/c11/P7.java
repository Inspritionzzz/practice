package com.bupt.thinkinjava.c11;

import java.util.*;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

/**
 * ①把数组转换成List的方式
 * ②尝试创建list的子集sublist
 * ③从list中移除sublist
 */
class Test01{
    private static int id;
    private int count=id++;

    public static int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Test01{" +
                "count=" + count +
                '}';
    }
}
public class P7 {

    static Test01[] fill(Test01[] test01s){
        for(int i=0;i<test01s.length;i++){
            test01s[i]=new Test01();
        }
        return test01s;
    }

    public static void main(String[] args) {

        Test01[] test01s=P7.fill(new Test01[7]);
        for(int i=0;i<test01s.length;i++){
            printnb(test01s[i].getCount()+" ");
        }
        print();

        List<Test01> list=new ArrayList<Test01>(Arrays.asList(test01s));

        List<Test01> subList=list.subList(2,5);
        for (Test01 s:subList
             ) {
            printnb(s.getCount()+" ");
        }
        print();
        //subList.clear();
        list.removeAll(subList);
        //List<Test01> list1=list.remove(subList);
//        for (Test01 s:list
//             ) {
//            printnb(s.getCount()+" ");
//        }
        print(list);




    }
}
