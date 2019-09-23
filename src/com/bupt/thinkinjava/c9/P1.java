package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

abstract class Rodent{
//    void bite(){
//        print("Rodent bite");
//    }
    abstract void bite();
    public Rodent() {
        print("Rodent Constructor");
    }

    //@Override
//    public  String toString() {
//        return "Rodent";
//    }
    public abstract String toString();
}
class RodentImpl extends Rodent{
    @Override
    void bite() {
        print("Rodent bite");
    }

    public String toString(){
        return "RodentImpl";
    }
}
public class P1 {
    public static void main(String[] args) {
        RodentImpl rodent=new RodentImpl();
        rodent.bite();
        print(rodent.toString());
    }
}
