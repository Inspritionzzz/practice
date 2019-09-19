package com.bupt.thinkinjava.c7;


import static com.bupt.utils.Print.print;

/**
 * 使用代理；
 */

class Cleanser {
    private String s = "Cleanser";
    public void append(String a) { s += a; }
    public void dilute() { append(" dilute()"); }
    public void apply() { append(" apply()"); }
    public void scrub() { append(" scrub()"); }
    public String toString() { return s; }
    public static void main(String[] args) {
        com.bupt.thinkinjava.c7.Cleanser x = new com.bupt.thinkinjava.c7.Cleanser();
        x.dilute(); x.apply(); x.scrub();
        print(x);
    }
}
class MyDetergent {
    String str;
    public void setStr(String str) {
        this.str = str;
    }
    private Cleanser cleanser=new Cleanser();

    public void scrub(){
        cleanser.scrub();
    }
    public void dilute(){
        cleanser.dilute();
    }
    public void apply(){
        cleanser.apply();
    }

    @Override
    public String toString() {
        return cleanser.toString();
    }
}
public class P11 {
    public static void main(String[] args) {
        MyDetergent myDetergent=new MyDetergent();
        myDetergent.scrub();
        print(myDetergent);
        print(myDetergent.toString());
    }
}
