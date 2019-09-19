package com.bupt.thinkinjava.reusing;//: reusing/Cartoon.java
// Constructor calls during inheritance.
//import static net.mindview.util.Print.*;
import static com.bupt.utils.Print.print;
class Art {
  Art() { print("Art constructor"); }
}

class Drawing extends Art {
  Drawing() { print("Drawing constructor"); }
}

public class Cartoon extends Drawing {
  public Cartoon() { print("Cartoon constructor"); }
  public static void main(String[] args) {
    Cartoon x = new Cartoon();
  }
} /* Output:
Art constructor
Drawing constructor
Cartoon constructor
*///:~
