package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

class MySequence{
    String string;

    @Override
    public String toString() {
        return "MySequence";
    }
}
public class P2 {
    public static void main(String[] args) {
        Sequence sequence=new Sequence(10);
        for(int i=0;i<10;i++){
            sequence.add(new MySequence());
        }
        Selector selector=sequence.selector();
        while (!selector.end()){
            print(selector.current());
            selector.next();
        }
    }
}
