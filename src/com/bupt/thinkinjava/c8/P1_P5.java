package com.bupt.thinkinjava.c8;

import static com.bupt.utils.Print.print;

/**
 * 测试向上转型；
 * 验证方法调用是子类的方法；
 */

class Cycle{
    public int wheels(){
        return 0;
    }

}
class Unicycle extends Cycle{
    public String toString() {
        return "Unicycle";
    }
    public int wheels(){
        return 1;
    }
}

class Bicycle extends Cycle{
    public String toString() {
        return "Bicycle";
    }
    public int wheels(){
        return 2;
    }
}

class Tricycle extends Cycle{

    public String toString() {
        return "Tricycle";
    }
    public int wheels(){
        return 3;
    }
}
public class P1_P5{
    static void ride(Cycle cycle){
        print(cycle+" "+cycle.wheels()+" up");
    }
    public static void main(String[] args) {
        Unicycle cycle1=new Unicycle();
        Bicycle cycle2=new Bicycle();
        Tricycle cycle3=new Tricycle();

        ride(cycle1);
        ride(cycle2);
        ride(cycle3);
    }
}
