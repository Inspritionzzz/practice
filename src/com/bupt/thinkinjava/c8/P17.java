package com.bupt.thinkinjava.c8;

import static com.bupt.utils.Print.print;

/**
 * 向上转型和向上转型；
 */
class Cycle2{
    public int wheels(){
        return 0;
    }

}
class Unicycle2 extends Cycle2{
    public String toString() {
        return "Unicycle";
    }
    public int wheels(){
        return 1;
    }
    public void balance(){
        print("Unicycle2 balance");
    }
}

class Bicycle2 extends Cycle2{
    public String toString() {
        return "Bicycle";
    }
    public int wheels(){
        return 2;
    }
    public void balance(){
        print("Bicycle2 balance");
    }
}

class Tricycle2 extends Cycle2{

    public String toString() {
        return "Tricycle";
    }
    public int wheels(){
        return 3;
    }
}
public class P17{
    static void ride(Cycle2 cycle2){
        print(cycle2+" "+cycle2.wheels()+" up");
    }
    public static void main(String[] args) {
//        Unicycle2 cycle1=new Unicycle2();
//        Bicycle2 cycle2=new Bicycle2();
//        Tricycle2 cycle3=new Tricycle2();
//
//        ride(cycle1);
//        ride(cycle2);
//        ride(cycle3);
        Cycle2[] cycles={
                new Unicycle2(),
                new Bicycle2(),
                new Tricycle2(),
        };//向上转型
//        cycles[0].balance();
//        cycles[1].balance();
//        cycles[2].balance();
//
        ((Unicycle2)cycles[0]).balance();//向下转型
        ((Unicycle2)cycles[1]).balance();
        //((Tricycle2)cycles[2]).balance();
    }
}