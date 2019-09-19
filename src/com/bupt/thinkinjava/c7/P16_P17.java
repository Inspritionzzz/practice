package com.bupt.thinkinjava.c7;

import static com.bupt.utils.Print.print;

/**
 * 调用方法向上转型；
 */
class Amphibian{
    void walk(){

    }
}

class Frog extends Amphibian{
    void sing(){

    }

    void jump(){

    }

    void rap(){

    }

    void walk(){
        print("Frog walk");
    }
}
public class P16_P17 {
    public static void main(String[] args) {
        Frog frog=new Frog();
        frog.walk();
    }
}
