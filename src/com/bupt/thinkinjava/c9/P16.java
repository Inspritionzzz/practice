package com.bupt.thinkinjava.c9;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

import static com.bupt.utils.Print.print;

class Test11 implements Readable{
    int count;
    Test11(int count){
        this.count=count;
    }
    @Override
    public int read(CharBuffer charBuffer) throws IOException {
        if(count--==0)
        {
            return -1;
        }
        charBuffer.append("a");
        return count;
    }
}
class CharSequence{
    private static Random rand = new Random();
    private static final char[] capitals =
            "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers =
            "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] vowels =
            "aeiou".toCharArray();

    char[] sequenceGenerte(){
        char[] buffer=new char[10];
        int index=0;
        buffer[index++]=capitals[rand.nextInt(capitals.length)];
        for(int i=0;i<4;i++){
            buffer[index++]=lowers[rand.nextInt(lowers.length)];
            buffer[index++]=vowels[rand.nextInt(vowels.length)];
        }
        //print(" ");
        return buffer;
    }
}

class CharGenerate extends CharSequence implements Readable{
    int count;
    CharGenerate(int count){
        this.count=count;
    }
    @Override
    public int read(CharBuffer charBuffer) throws IOException {

        if(count--==0){
            return -1;
        }
        char[] buffer=sequenceGenerte();
        charBuffer.put(buffer);
        charBuffer.append(" ");
        //print(" ");
        return buffer.length;
    }
}
public class P16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(new Test11(3));
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        Scanner scanner1=new Scanner(new CharGenerate(10));
        while (scanner1.hasNext()){
            print(scanner1.next());
        }
    }
}
