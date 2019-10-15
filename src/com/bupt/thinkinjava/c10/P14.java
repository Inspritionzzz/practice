package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 匿名内部类实现接口；
 */
interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class   DragonZilla implements DangerousMonster {
    public void menace() {}
    public void destroy() {}
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire {
    public void menace() {}
    public void destroy() {}
    public void kill() {}
    public void drinkBlood() {}
}

class HorrorShow {
    static void u(Monster b) { b.menace(); }
    static void v(DangerousMonster d) {
        d.menace();
        d.destroy();
    }
    static void w(Lethal l) { l.kill(); }
    public static void main(String[] args) {
        DangerousMonster barney = new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad = new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}

class MyHorrorShow{
    static void uu(){
        new Monster(){
            @Override
            public void menace() {
                print("uu Monster menace");
            }
        }.menace();
    }

    static void vv(){
        new DangerousMonster(){
            @Override
            public void destroy() {
                print("vv DangerousMonster destroy");
            }

            @Override
            public void menace() {
                print("vv DangerousMonster menace");
            }
        }.destroy();//匿名内部类只能调用一个方法？
    }

    static void ww(){
        new Lethal(){
            @Override
            public void kill() {
                print("ww Lethal kill");
            }
        }.kill();
    }
}
public class P14 {
    public static void main(String[] args) {
        //MyHorrorShow myHorrorShow=new MyHorrorShow();
        DangerousMonster dangerousMonster=new DragonZilla(){
            @Override
            public void menace() {
                super.menace();
            }

            @Override
            public void destroy() {
                super.destroy();
            }
        };
        HorrorShow.u(dangerousMonster);
        HorrorShow.v(dangerousMonster);
        Vampire lethal=new Vampire(){
            @Override
            public void menace() {

            }

            @Override
            public void destroy() {

            }

            @Override
            public void kill() {

            }

            @Override
            public void drinkBlood() {

            }
        };
        HorrorShow.u(lethal);
        HorrorShow.v(lethal);
        MyHorrorShow.uu();
        MyHorrorShow.vv();
        MyHorrorShow.ww();
    }
}
