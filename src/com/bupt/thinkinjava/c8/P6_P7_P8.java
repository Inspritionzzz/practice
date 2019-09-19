package com.bupt.thinkinjava.c8;

import java.util.Random;

import static com.bupt.utils.Print.print;

/**
 * 测试继承的向上转型（方法执行时，输入参数，自动向上转型）
 *
 */
class Instrument {
    void play(Note n) { print("Instrument.play() " + n); }
    //String what() { return "Instrument"; }

    public String toString() {
        return "Instrument";
    }

    void adjust() { print("Adjusting Instrument"); }
}

class Wind extends Instrument {
    void play(Note n) { print("Wind.play() " + n); }
    //String what() { return "Instrument"; }
    public String toString() {
        return "Wind";
    }
    void adjust() { print("Adjusting Wind"); }
}

class Percussion extends Instrument {
    void play(Note n) { print("Percussion.play() " + n); }
    //String what() { return "Percussion"; }
    public String toString() {
        return "Percussion";
    }
    void adjust() { print("Adjusting Percussion"); }
}

class Stringed extends Instrument {
    void play(Note n) { print("Stringed.play() " + n); }
    //String what() { return "Stringed"; }
    public String toString() {
        return "Stringed";
    }
    void adjust() { print("Adjusting Stringed"); }
}

class Brass extends Wind {
    void play(Note n) { print("Brass.play() " + n); }
    void adjust() { print("Adjusting Brass"); }
}

class Woodwind extends Wind {
    void play(Note n) { print("Woodwind.play() " + n); }
    //String what() { return "Woodwind"; }
    public String toString() {
        return "Woodwind";
    }
}
class Violin extends Instrument{
    void play(Note n) {
        print("Violin.play() "+n);
    }

    public String toString() {
        return "Violin";
    }

    void adjust() {
        print("Adjusting Violin");
    }
}
class RandomInstrument{
    Random random=new Random(50);
    public Instrument getInstrument() {
        switch (random.nextInt(6)) {
            default:
            case 0:
                return new Wind();
            case 1:
                return new Percussion();
            case 2:
                return new Violin();
            case 3:
                return new Stringed();
            case 4:
                return new Brass();
            case 5:
                return new Woodwind();
        }
    }
}
public class P6_P7_P8 {
    // Doesn't care about type, so new types
    // added to the system still work right:
    public static void tune(Instrument i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    public static void tuneAll(Instrument[] e) {
        for(Instrument i : e)
            tune(i);
    }
    public static void printAll(Instrument[] e){
        for (Instrument i:e
             ) {
            print(i);
        }
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind(),
                new Violin()
        };
        tuneAll(orchestra);
        printAll(orchestra);
        RandomInstrument randomInstrument=new RandomInstrument();

        Instrument[] instruments=new Instrument[5];
        for(int i=0;i<instruments.length;i++){
            instruments[i]=randomInstrument.getInstrument();
        }
        print("test randomInstrument:");
        printAll(instruments);

//        Instrument instrument=new Instrument();
//        System.out.println(instrument);
    }
}