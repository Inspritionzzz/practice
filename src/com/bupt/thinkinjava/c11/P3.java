package com.bupt.thinkinjava.c11;//: innerclasses/P3.java
// Holds a sequence of Objects.

import java.util.ArrayList;
import java.util.List;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

/**
 * 迭代器设计模式；
 * Sequence装数据，Selector取数据（对外暴露三个接口）;
 * Selector写在Sequence里面；
 */
interface Selector {
  boolean end();
  Object current();
  void next();
}

public class P3 {
  private Object[] items;
  private int next = 0;
  public P3(int size) {
    items = new Object[size];
    //list=new ArrayList<>();
  }
  public void add(Object x) {
    if(next < items.length)
      items[next++] = x;
  }

  private List<Object> list=new ArrayList<>();
  public void add1(Object x){
    list.add(x);
  }

  private class SequenceSelector02 implements Selector{
    private int i=0;
    @Override
    public boolean end() {
      return i==list.size();
    }

    @Override
    public Object current() {
      return list.get(i);
    }

    @Override
    public void next() {
      if(i<list.size())
        i++;
    }
  }

  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.length; }
    public Object current() { return items[i]; }
    public void next() { if(i < items.length) i++; }
    public P3 getSequence(int size){
      //return new Sequence(size);//新建一个外部类
      return P3.this;//得到对外部类的引用
    }
  }
  public Selector selector() {
    return new SequenceSelector();
  }
  public Selector selector1() {
    return new SequenceSelector02();
  }
  public static void main(String[] args) {
    P3 sequence = new P3(10);
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }

    print();
    print("=========");

    P3 p3=new P3(7);
    for(int i=0;i<7;i++){
      p3.add1(Integer.toString(i));
    }
    Selector selector1=p3.selector1();
    while(!selector1.end()){
      printnb(selector1.current()+" ");
      selector1.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
