package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

/**
 * 实现Sequence.java中的reverseSelector()方法；
 */
//interface Selector {
//    boolean end();
//    Object current();
//    void next();
//}
class MySequence02{
    private Object[] items;
    private int next=0;
    public MySequence02(int size) {
        items=new Object[size];
    }
    public void add(Object x){
        items[next++]=x;
    }
    private class MySequenceSelector implements Selector {
        private int i = 0;
        public boolean end() { return i == items.length; }
        public Object current() { return items[i]; }
        public void next() { if(i < items.length) i++; }
        public MySequence02 getSequence(int size){
            //return new Sequence(size);//新建一个外部类
            return MySequence02.this;//得到对外部类的引用
        }
    }
    private class ReverseMySequenceSelector implements Selector{
        private int i=items.length-1;
        private int count=items.length;
        @Override
        public boolean end() {
            return count == 0;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if(count>0)
                count--;
        }
        public MySequence02 getMySequence02(int size){
            return MySequence02.this;
        }
    }

    public Selector selector() {
        return new MySequence02.MySequenceSelector();
    }

    public Selector selector02(){
        return new MySequence02.ReverseMySequenceSelector();
    }
    public int getItemsLength() {
        return items.length;
    }
}

public class P22 {
    public static void main(String[] args) {
        MySequence02 mySequence02=new MySequence02(10);
        for(int i=0;i<mySequence02.getItemsLength();i++){
            mySequence02.add(Integer.toString(i));
        }
        Selector selector=mySequence02.selector();
        for(int i=0;i<mySequence02.getItemsLength();i++){
            //mySequence02.add(Integer.toString(i));
            printnb(selector.current()+" ");
            selector.next();
            print("end?"+" "+selector.end());
        }
        System.out.println("===================");
        Selector selector1=mySequence02.selector02();
        for(int i=0;i<mySequence02.getItemsLength();i++){
            printnb(selector1.current()+" ");
            selector1.next();
            print("end?"+" "+selector1.end());
        }
    }
}
