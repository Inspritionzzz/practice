package com.bupt.thinkinjava.c11;

import java.util.ArrayList;
import java.util.List;

import static com.bupt.utils.Print.print;

class Gerbil{
    private int gerbilNumber;

    public Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    void hop(){
        print("Gerbil:"+gerbilNumber+"jump");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
public class P1 {
    public static void main(String[] args) {
        List<Gerbil> list=new ArrayList<Gerbil>();
        for(int i=0;i<10;i++){
            list.add(new Gerbil(i));
            list.get(i).hop();
        }

        //使用foreach
        System.out.println("===============");
        for (Gerbil g:list
             ) {
            g.hop();
        }
    }
}
