package com.bupt.thinkinjava.c10;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import static com.bupt.utils.Print.print;

class WithInner{
    int id;
    WithInner(){
        System.out.println("外围类的构造器");
    }
    WithInner(int id){
        this.id=id;
        System.out.println("外围类id："+id);
    }
    class Inner{
        Inner(){
            System.out.println("内部类的构造器");
        }
        WithInner getWithInner(){
           // return new WithInner(4);
            return WithInner.this;
        }
    }
}
class MyInner extends WithInner.Inner {
    MyInner(WithInner withInner){
        withInner.super();
    }
}

//class Test1 implements Collection {
//
//
//}
//
//class Test1 extends AbstractCollection{
//    @Override
//    public Iterator iterator() {
//        return null;
//    }
//
//    @Override
//    public int size() {
//        return 0;
//    }
//}
public class Test {
    public static void main(String[] args) {
        new MyInner(new WithInner());
        System.out.println("++++++++++++");
        WithInner withInner=new WithInner(3);
        WithInner.Inner inner=withInner.new Inner();
        WithInner withInner1=inner.getWithInner();
        print(withInner1.id);
        System.out.println("++++++++++++");
        print(System.getenv());
        for(Map.Entry entry:System.getenv().entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());

        }
    }
}
