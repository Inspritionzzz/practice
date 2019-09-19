package com.bupt.thinkinjava.c8;

import static com.bupt.utils.Print.print;

/**
 * 状态模式；
 */
class Actor {
    public void act() {}
}

class HappyActor extends Actor {
    public void act() { print("HappyActor"); }
}

class SadActor extends Actor {
    public void act() { print("SadActor"); }
}

class Stage {
    private Actor actor = new HappyActor();
    public void change() { actor = new SadActor(); }
    public void performPlay() { actor.act(); }
}

class Starship{
    public void AlertStatus(){

    }
}

class Status1 extends Starship{
    public void AlertStatus(){
        print("Status1");
    }
}

class Status2 extends Starship{
    public void AlertStatus(){
        print("Status2");
    }
}

class ChangeStatus{
    Starship starship=new Status1();
    void printStatus(){
        starship.AlertStatus();
    }
    void changeStatus(){
        starship=new Status2();
    }
}

public class P16{
    public static void main(String[] args) {
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
        print("++++++++++++++++++++++");
        ChangeStatus changeStatus=new ChangeStatus();
        changeStatus.printStatus();
        changeStatus.changeStatus();
        changeStatus.printStatus();
    }
}