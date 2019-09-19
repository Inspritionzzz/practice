package com.bupt.thinkinjava.c8;

import java.util.Random;

import static com.bupt.utils.Print.print;

class Rodent{
    void bite(){
        print("Rodent bite");
    }

    public Rodent() {
        print("Rodent Constructor");
    }

    //@Override
    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent{

    public Mouse() {
        print("Mouse Constructor");
    }
    @Override
    void bite(){
        print("Mouse bite");
    }
    //@Override
    public String toString() {
        return "Mouse";
    }
}

class Gerbil extends Mouse{

    public Gerbil() {
        print("Gerbil Constructor");
    }
    @Override
    void bite(){
        print("Gerbil bite");
    }
    //@Override
    public String toString() {
        return "Gerbil";
    }
}

class Hamster extends Gerbil{

    public Hamster() {
        print("Hamster Constructor");
    }
    @Override
    void bite(){
        print("Hamster bite");
    }
    //@Override
    public String toString() {
        return "Hamster";
    }
}
class RandomRodent{

    Random random=new Random(99);
    public Rodent getRodent(){

        switch(random.nextInt(4)){
            default:
            case 0:
                return new Rodent();
            case 1:
                return new Mouse();
            case 2:
                return new Gerbil();
            case 3:
                return new Hamster();

        }
    }

}
public class P9_P12 {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[5];
        RandomRodent randomRodent=new RandomRodent();
        for(int i=0;i<rodents.length;i++){
            rodents[i]=randomRodent.getRodent();
        }
//        Rodent[] rodents1={
//            randomRodent.getRodent(),
//            randomRodent.getRodent(),
//            randomRodent.getRodent(),
//        };
        for (Rodent r:rodents
             ) {
            print(r);
        }
        Random random = new Random(47);
        //System.out.println(random.nextInt(4));
        //System.out.println(random.nextInt(4));
        System.out.println("++++++++++++++++++++");

        new Hamster();
    }
}
