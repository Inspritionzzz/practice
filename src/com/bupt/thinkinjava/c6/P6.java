package com.bupt.thinkinjava.c6;

class WithProtected {
    protected int i;
}
public class P6{
    public static void main(String args[]) {
        WithProtected wp = new WithProtected();
        wp.i = 47;
        System.out.println("wp.i = " + wp.i);
    }
}