package com.bupt.thinkinjava.c7;

import com.bupt.thinkinjava.reusing.Detergent;

import static com.bupt.utils.Print.print;

/**
 * 重写父类的方法；
 */

class NewDetergent extends Detergent {

    public void scrub(){
        append("NewDetergent's srcub");
        super.scrub();
    }
    public void sterilize(){
          System.out.println("New function");
    }

}
public class P2 {
    public static void main(String[] args) {
        NewDetergent newDetergent=new NewDetergent();
        newDetergent.dilute();
        print(newDetergent);
        newDetergent.apply();
        print(newDetergent);
        newDetergent.scrub();
        print(newDetergent);
        newDetergent.sterilize();

    }
}
