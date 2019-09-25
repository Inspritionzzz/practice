package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

/**
 * 工厂模式
 */
interface Cycle{
    void f();
}
interface CycleFactory{
    Cycle getCycle();
}
class Unicycle implements Cycle{
    @Override
    public void f() {

    }

    @Override
    public String toString() {
        return "Unicycle";
    }
}
class UnicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}

class Bicycle implements Cycle{
    @Override
    public void f() {

    }
}
class BicycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Bicycle();
    }
}

class Tricycle implements Cycle{
    @Override
    public void f() {

    }
}
class  TricycleFactory implements CycleFactory{
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
public class P18 {
    //操作接口；
    public static void getCycles(CycleFactory cycleFactory){
        Cycle cycle=cycleFactory.getCycle();
        print(cycle.toString());

    }
    public static void main(String[] args) {
        P18.getCycles(new UnicycleFactory());
    }
}
