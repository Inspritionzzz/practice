package com.bupt.thinkinjava.c9;

interface Cycle1 {
    int wheels();
}
interface CycleFactory1 {
    Cycle1 getCycle();
}
class Unicycle1 implements Cycle1 {
    public int wheels() { return 1; }
}
class UnicycleFactory1 implements CycleFactory1 {
    public Unicycle1 getCycle() { return new Unicycle1(); }
}
class Bicycle1 implements Cycle1 {
    public int wheels() { return 2; }
}
class BicycleFactory1 implements CycleFactory1 {
    public Bicycle1 getCycle() { return new Bicycle1(); }
}
class Tricycle1 implements Cycle1 {
    public int wheels() { return 3; }
}
class TricycleFactory1 implements CycleFactory1 {
    public Tricycle1 getCycle() { return new Tricycle1(); }
}
public class P18a {
    public static void ride(CycleFactory1 fact) {
        Cycle1 c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        ride(new UnicycleFactory1());
        ride(new BicycleFactory1());
        ride(new TricycleFactory1());
    }
}