package com.bupt.thinkinjava.c7;

import static com.bupt.utils.Print.print;

/**
 * 手动处理继承的清理；
 */
class ComponentAA{
    ComponentAA(){
        System.out.println("ComponentAA");
    }
    void dispose(){
        print("dispose ComponentAA");
    }
}

class ComponentBB{
    ComponentBB(){
        System.out.println("ComponentBB");
    }
    void dispose(){
        print("dispose ComponentBB");
    }
}

class ComponentCC{
    ComponentCC(){
        System.out.println("ComponentCC");
    }
    void dispose(){
        print("dispose ComponentCC");
    }
}

class Root11{
    ComponentAA componentaa=new ComponentAA();
    ComponentBB componentbb=new ComponentBB();
    ComponentCC componentcc=new ComponentCC();

    Root11(){
        System.out.println("Root1");
    }
    void dispose(){
        print("dispose Root11");
        componentcc.dispose();
        componentbb.dispose();
        componentaa.dispose();
    }
}

class Stem11 extends Root11{
    ComponentAA componentaa=new ComponentAA();
    ComponentBB componentbb=new ComponentBB();
    ComponentCC componentcc=new ComponentCC();

    Stem11(){
        System.out.println("Stem1");
    }
    void dispose(){
        print("dispose Stem11");
        componentcc.dispose();
        componentbb.dispose();
        componentaa.dispose();
        super.dispose();
    }
}
public class P12 {
    public static void main(String[] args) {
        Stem11 stem1=new Stem11();
        stem1.dispose();
    }
}
