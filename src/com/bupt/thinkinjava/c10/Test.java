package com.bupt.thinkinjava.c10;

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
public class Test {
    public static void main(String[] args) {
        new MyInner(new WithInner());
        System.out.println("++++++++++++");
        WithInner withInner=new WithInner(3);
        WithInner.Inner inner=withInner.new Inner();
        WithInner withInner1=inner.getWithInner();
        print(withInner1.id);
    }
}
