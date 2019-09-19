package com.bupt.thinkinjava.c8;
import java.util.*;

import static com.bupt.utils.Print.print;

/**
 * 1  验证向上转型；
 * 2  覆写父类的方法；
 *
 */
class Shape{
    public void draw(){

    }
    public void erase(){

    }

    public void printInfo(){
        print("Shape printInfo");
    }
}

class RandomShapeGenerator {
    private Random rand = new Random(47);
    public Shape next() {
        switch(rand.nextInt(3)) {
            default:
            case 0: return new Circle();
            case 1: return new Square();
            case 2: return new Triangle();
        }
    }
} ///:~
//: polymorphism/oshape/Square.java
class Square extends Shape {
    @Override public void draw() { print("Square.draw()"); }
    @Override public void erase() { print("Square.erase()"); }
    //@Override public void printInfo(){print("Square printInfo");}
} ///:~
class Tetrahedron extends Shape {
    public void draw() { print("Tetrahedron.draw()"); }
    public void erase() { print("Tetrahedron.erase()"); }
    public void msg() { print("Tetrahedron.msg()"); }
}

class Triangle extends Shape {
    @Override public void draw() { print("Triangle.draw()"); }
    @Override public void erase() {
        print("Triangle.erase()");
    }
    //@Override public void printInfo(){print("Triangle printInfo");}
} ///:~

class Circle extends Shape {
    @Override public void draw() { print("Circle.draw()"); }
    @Override public void erase() { print("Circle.erase()"); }
    //@Override public void printInfo(){print("Circle printInfo");}
} ///:~

public class P2_P3_P4 {
    public static void main(String[] args) {
        RandomShapeGenerator randomShapeGenerator=new RandomShapeGenerator();
        Shape[] shape=new Shape[9];
        for(int i=0;i< shape.length;i++){
            shape[i]=randomShapeGenerator.next();
        }
        for (Shape s:shape
        ) {
            //s.draw();
            s.printInfo();
        }
//        for (Shape s:shape
//        ) {
//            s=randomShapeGenerator.next();
//        }
    }
}
