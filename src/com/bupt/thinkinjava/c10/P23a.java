package com.bupt.thinkinjava.c10;

class AA {
    public U getU() {
        return new U() {
            public void f1() { System.out.println("A.f1"); }
            public void f2() { System.out.println("A.f2"); }
            public void f3() { System.out.println("A.f3"); }
        };
    }
}
class BB {
    U[] ua;
    public BB(int size) {
        ua = new U[size];
    }
    public boolean add(U elem) {
        for(int i = 0; i < ua.length; i++) {
            if(ua[i] == null) {
                ua[i] = elem;
                return true;
            }
        }
        return false; // Couldn't find any space
    }
    public boolean setNull(int i) {
        if(i < 0 || i >= ua.length)
            return false; // Value out of bounds
// (Normally throw an exception)
        ua[i] = null;
        return true;
    }
    public void callMethods() {
        for(int i = 0; i < ua.length; i++)
            if(ua[i] != null) {
                ua[i].f1();
                ua[i].f2();
                ua[i].f3();
            }
    }
}
public class P23a {
    public static void main(String args[]) {
        AA[] aa = { new AA(), new AA(), new AA() };
        BB b = new BB(3);
        for(int i = 0; i < aa.length; i++)
            b.add(aa[i].getU());
        b.callMethods();
        System.out.println("****");
        b.setNull(0);
        b.callMethods();
    }
}