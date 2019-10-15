package com.bupt.thinkinjava.c10;

/**
 * 使用匿名内部类重写工厂模式；
 */
interface Cycle1 {
    int wheels();
}

interface CycleFactory1 {
    Cycle1 getCycle();
}

class Unicycle1 implements Cycle1 {
    public int wheels() { return 1; }
    public static CycleFactory1 factory1= new CycleFactory1() {
        @Override
        public Cycle1 getCycle() {
            return new Unicycle1();
        }
    };
}
//class UnicycleFactory1 implements CycleFactory1 {
//    public Unicycle1 getCycle() { return new Unicycle1(); }
//
//}
class Bicycle1 implements Cycle1 {
    public int wheels() { return 2; }
    public static CycleFactory1 factory1= new CycleFactory1() {
        @Override
        public Cycle1 getCycle() {
            return new Bicycle1();
        }
    };
}

//class BicycleFactory1 implements CycleFactory1 {
//    public Bicycle1 getCycle() { return new Bicycle1(); }
//}

class Tricycle1 implements Cycle1 {
    public int wheels() { return 3; }
    public static CycleFactory1 factory1= new CycleFactory1() {
        @Override
        public Cycle1 getCycle() {
            return new Tricycle1();
        }
    };
}
//class TricycleFactory1 implements CycleFactory1 {
//    public Tricycle1 getCycle() { return new Tricycle1(); }
//}

public class P16 {
    public static void ride(CycleFactory1 fact) {
        Cycle1 c = fact.getCycle();
        System.out.println("Num. of wheels: " + c.wheels());
    }
    public static void main(String[] args) {
        ride(Unicycle1.factory1);
        ride(Bicycle1.factory1);
        ride(Tricycle1.factory1);
    }
}