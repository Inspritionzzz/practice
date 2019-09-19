package com.bupt.thinkinjava.c7;

import static com.bupt.utils.Print.print;

class Engine {
    public void start() {}
    public void rev() {}
    public void stop() {}
    public void service(){print("service");}
}

class Wheel {
    public void inflate(int psi) {}
}

class Window {
    public void rollup() {}
    public void rolldown() {}
}

class Door {
    public Window window = new Window();
    public void open() {}
    public void close() {}
}

public class P14{
    public Engine engine = new Engine();
    public Wheel[] wheel = new Wheel[4];
    public Door
            left = new Door(),
            right = new Door(); // 2-door
    public P14() {
        for(int i = 0; i < 4; i++)
            wheel[i] = new Wheel();
    }
    public static void main(String[] args) {
        P14 car = new P14();
        car.left.window.rollup();
        car.wheel[0].inflate(72);
        car.engine.service();
    }
} ///:~
