package com.bupt.thinkinjava.c8;

import com.bupt.thinkinjava.simple.TestProtect;

import java.io.IOException;
import java.lang.annotation.Repeatable;
import java.nio.CharBuffer;

class A{
    int a=1;
    final int b=2;
    final long c=3;
    //int count;
    static int count=0;//只有一块区域，aa指定的区域不变；
    final int counter=count++;
//    void setB(){
//        this.b=2;
//    }
}

class RandomEwords implements Readable{
    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        return 0;
    }
}
public class Test {
    public static void main(String[] args) {

        for(int i=0;i<9;i++){
            A aa=new A();
            //aa.b=3;
            //aa.c=4;
            System.out.println(aa.counter);
        }
        //TestProtect1.f1();


    }
}
