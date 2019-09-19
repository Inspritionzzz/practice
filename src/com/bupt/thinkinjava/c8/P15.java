package com.bupt.thinkinjava.c8;

import static com.bupt.utils.Print.print;

/**
 * 产生歧义：构造器内部调用方法的多态情况
 */

class Glyph {
    void draw() { print("Glyph.draw()"); }
    Glyph() {
        print("Glyph() before draw()");
        draw();
        print("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    private int radius = 1;
    RoundGlyph(int r) {
        radius = r;
        print("RoundGlyph.RoundGlyph(), radius = " + radius);
    }
    void draw() {
        print("RoundGlyph.draw(), radius = " + radius);
    }
}

class RectangularGlyph extends Glyph {
    private int width = 4;
    private int height = 5;
    RectangularGlyph(int width, int height) {
        this.width = width;
        this.height = height;
        print("RectangularGlyph.RectangularGlyph(), width = " + width + ", height = " + height);
    }
    void draw() {
        print("RectangularGlyph.draw(), area = " + width *
                height);
    }
}

public class P15{
    public static void main(String[] args) {
        //new RoundGlyph(5);
        new RectangularGlyph(4,5);
    }
}