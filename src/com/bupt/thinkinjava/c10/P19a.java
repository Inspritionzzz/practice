package com.bupt.thinkinjava.c10;

public class P19a{
    class Inner1 {
        class Inner2 {
            void f() {}
        }
        Inner2 makeInner2() { return new Inner2(); }
    }
    Inner1 makeInner1() { return new Inner1(); }
    static class Nested1 {
        static class Nested2 {
            void f() {}
        }
        void f() {}
    }
    public static void main(String args[]) {
        new P19a.Nested1().f();
        new P19a.Nested1.Nested2().f();
        P19a x1 = new P19a();
        P19a.Inner1 x2 = x1.makeInner1();
        P19a.Inner1.Inner2 x3 = x2.makeInner2();
        x3.f();
    }
}