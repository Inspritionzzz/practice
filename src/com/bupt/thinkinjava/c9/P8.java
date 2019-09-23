package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

class Meal {
    Meal() { print("Meal()"); }
}

class Bread {
    Bread() { print("Bread()"); }
}

class Cheese {
    Cheese() { print("Cheese()"); }
}

class Lettuce {
    Lettuce() { print("Lettuce()"); }
}
interface FastFood{
    void f1();
}

class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}

class Hamberger implements FastFood{
    @Override
    public void f1() {
        print("fastfood");
    }
}

public class P8 extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public P8() { print("Sandwich()"); }
    public static void main(String[] args) {
        new P8();
        FastFood fastFood=new Hamberger();
        fastFood.f1();
    }
}