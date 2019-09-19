package com.bupt.thinkinjava.c7;

import static com.bupt.utils.Print.print;

class Simple {
    String s;
    public Simple(String si) { s = si; }
    public String toString() { return s; }
    public void setString(String sNew) { s = sNew; }
}
class Second {
    Simple simple;
    String s;

    Second(String str){
        this.s=str;
    }

    public void check(){
        if(simple==null){
            System.out.println("not inatialize");
        }else {
            System.out.println("inatiallize");
        }
    }

    public Simple lazy(){
        if(simple==null){
            print("惰性初始化：");
            simple=new Simple(s);
        }
        return simple;

        //return simple;
    }

    public Simple getSimple(){
        return lazy();
    }


    public String toString(){
        return lazy().toString();
    }

    public void setSimple(String str){

        lazy().setString(str);
    }
}

public class P1 {
    public static void main(String[] args) {
        Second second = new Second("Init String");
        second.check();
        print(second.getSimple());
        second.check();
        print(second); // toString() call
        second.setSimple("New String");
        print(second);

    }
}
