package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;

interface Rodent1 {
      void hop();

      void scurry();

      void reproduce();
 }
    class Mouse implements Rodent1 {
        public void hop() { print("Mouse hopping"); }
        public void scurry() { print("Mouse scurrying"); }
        public void reproduce() { print("Making more Mice"); }
        public String toString() { return "Mouse"; }
    }
    class Gerbil implements Rodent1 {
        public void hop() { print("Gerbil hopping"); }
        public void scurry() { print("Gerbil scurrying"); }
        public void reproduce() { print("Making more Gerbils"); }
        public String toString() { return "Gerbil"; }
    }
    class Hamster implements Rodent1 {
        public void hop() { print("Hamster hopping"); }
        public void scurry() { print("Hamster scurrying"); }
        public void reproduce() { print("Making more Hamsters"); }
        public String toString() { return "Hamster"; }
    }


    public class P7 {
        public static void main(String args[]) {
            Rodent1[] rodents = {
                    new Mouse(),
                    new Gerbil(),
                    new Hamster(),
            };
            for(Rodent1 r : rodents) {
                r.hop();
                r.scurry();
                r.reproduce();
                print(r);
            }
        }
    }