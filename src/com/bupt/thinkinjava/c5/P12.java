package com.bupt.thinkinjava.c5;


class Tank{

    static int counter;

    int id=counter++;

    boolean status=true;//满

    Tank(){
        System.out.println("Tank:"+id);
        this.status=true;
    }
    void empty(){
        this.status=false;
    }

    protected void finalize(){
        if(status)
            System.out.println("error!  Tankid="+id);
    }

}

public class P12 {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        System.gc();
        System.runFinalization();
    }
}
