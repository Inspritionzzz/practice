package com.bupt.thinkinjava.c7;

//import com.bupt.thinkinjava.reusing.Beetle;
import static com.bupt.utils.Print.print;
class Insect {
    private int i = 9;
    protected int j;
    Insect() {
        print("i = " + i + ", j = " + j);
        j = 39;
    }
    private static int x1 =
            printInit("static Insect.x1 initialized");
    static int printInit(String s) {
        print(s);
        return 47;
    }
}
class Beetle extends Insect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }
    private static int x2 =
            printInit("static Beetle.x2 initialized");

}

public class JapaneseBeetle extends Beetle {
    int m = printInit("JapaneseBeetle.m initialized");
    JapaneseBeetle() {
        print("m = " + m);
        print("j = " + j);
    }
    static int x3 =
            printInit("static JapaneseBeetle.x3 initialized");
    //  public static void main(String[] args) {
//    print("Beetle constructor");
//    Beetle b = new Beetle();
//  }

    public static void main(String[] args) {
        new JapaneseBeetle();
    }
}
