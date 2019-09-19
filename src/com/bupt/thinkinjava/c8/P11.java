package com.bupt.thinkinjava.c8;
//import com.bupt.utils.Print.*;

import static com.bupt.utils.Print.print;

/**
 * 导出类的初始化顺序：1 基类构造器 2 域初始化  3  本类的构造器调用
 *
 *
 */
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
class Pickle{
    Pickle(){
        print("Pickle()");
    }
}

class Lunch extends Meal {
    Lunch() { print("Lunch()"); }
}

class PortableLunch extends Lunch {
    PortableLunch() { print("PortableLunch()");}
}

public class P11 extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    private Pickle p=new Pickle();
    public P11() { print("Sandwich()"); }
    public static void main(String[] args) {
        new P11();
    }
}
