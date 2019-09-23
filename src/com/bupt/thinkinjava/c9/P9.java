package com.bupt.thinkinjava.c9;

import com.bupt.thinkinjava.c8.Note;

import static com.bupt.utils.Print.print;

//interface Instrument {
//    // Compile-time constant:
//    int VALUE = 5; // static & final
//    // Cannot have method definitions:
//    void play(Note n); // Automatically public
//    void adjust();
//}
abstract class Instrument1{
    public void play(Note n) {
        print(this + ".play() " + n);
    }

    public void adjust() { print(this + ".adjust()"); }
    public abstract String toString();
}

class Wind1 extends Instrument1{
    public String toString() { return "Wind"; }
}

class Percussion1 extends Instrument1{
    public String toString() { return "Percussion"; }
}

class Stringed1 extends Instrument1{

    public String toString() { return "Stringed"; }

}

class Brass1 extends Wind1 {
    public String toString() { return "Brass"; }
}

class Woodwind1 extends Wind1 {
    public String toString() { return "Woodwind"; }
}

public class P9 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    static void tune(Instrument1 i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Instrument1[] e) {
        for(Instrument1 i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument1[] orchestra = {
                new Wind1(),
                new Percussion1(),
                new Stringed1(),
                new Brass1(),
                new Woodwind1()
        };
        tuneAll(orchestra);
    }
}