package com.bupt.thinkinjava.c7;

import static com.bupt.utils.Print.print;

class AAa{
    private final void f(){
        print("AAa的f()");
    }
    private void g(){
        print("AAa的g()");
    }
    public void h(){
        print("AAa的g()");
    }
}
class TestOverride extends AAa{


    public final void f(){
        print("TestOverride的f()");
    }
    public void g(){
        print("TestOverride的g()");
    }
    public  void h(){
        print("TestOverride的h()");
    }


}
public class P20 {
    public static void main(String[] args) {
        TestOverride testOverride=new TestOverride();
        testOverride.f();
        testOverride.h();
        AAa aa=new AAa();
        aa=testOverride;
        aa.h();
    }
}
