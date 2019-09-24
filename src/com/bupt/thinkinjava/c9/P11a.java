package com.bupt.thinkinjava.c9;

import com.bupt.thinkinjava.myinterface.Processor;

import static com.bupt.utils.Print.print;

class CharacterPairSwapper {
    static String swap(String s) {
        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < sb.length() - 1; i += 2) {
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(i + 1);
            sb.setCharAt(i, c2);
            sb.setCharAt(i + 1, c1);
        }
        return sb.toString();
    }
}
class SwapperAdapter implements Processor {
    public String name() {
        return CharacterPairSwapper.class.getSimpleName();
    }
    public String process(Object input) {
        return CharacterPairSwapper.swap((String)input);
    }
}
public class P11a {
    public static void process(Processor processor,Object s){
        print(processor.name());
        print(processor.process(s));
    }
    public static void main(String[] args) {
        P11a.process(new SwapperAdapter(), "1234");
        P11a.process(new SwapperAdapter(), "abcde");
    }
}