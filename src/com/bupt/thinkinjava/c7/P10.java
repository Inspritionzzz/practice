package com.bupt.thinkinjava.c7;

class ComponentA{
    ComponentA(int i){
        System.out.println("Component1"+"  "+i);
    }
}

class ComponentB{
    ComponentB(int i){
        System.out.println("Component1"+"  "+i);
    }
}

class ComponentC{
    ComponentC(int i){
        System.out.println("Component1"+"  "+i);
    }
}

class Root1{

    ComponentA component1=new ComponentA(1);
    ComponentB component2=new ComponentB(2);
    ComponentC component3=new ComponentC(3);

    Root1(String string){
        System.out.println("创建ROOT1"+"  "+string);

    }
}

class Stem1 extends Root1{

    ComponentA component1=new ComponentA(4);
    ComponentB component2=new ComponentB(5);
    ComponentC component3=new ComponentC(6);

    Stem1(String string){
        super(string);
        System.out.println("创建Stem");
    }
}
public class P10 {
    public static void main(String[] args) {
        new Stem1("HAHAHA");
    }
}
