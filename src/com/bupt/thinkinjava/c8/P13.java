package com.bupt.thinkinjava.c8;

import static com.bupt.utils.Print.print;

/**
 * 使用System.gc配合finalize检查清理情况；
 * 引入共享变量计数器；
 */
class Shared {
    private int refcount = 0;
    private static long counter = 0;
    private final long id = counter++;
    public Shared() {
        print("Creating " + this);
    }
    public void addRef() { refcount++; }
    protected void dispose() {
        if(--refcount == 0)
            print("Disposing " + this);
    }

   // @Override
    protected void finalize(){
        //super.finalize();
        if(refcount!=0)
            System.out.println("error");
    }

    public String toString() { return "Shared " + id; }
}

class Composing {
    private Shared shared;
    private static long counter = 0;
    private final long id = counter++;
    public Composing(Shared shared) {
        print("Creating " + this);
        this.shared = shared;
        this.shared.addRef();
    }
    protected void dispose() {
        print("disposing "  + this);
        shared.dispose();
    }
    public String toString() { return "Composing " + id; }
}

public class P13{
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = { new Composing(shared),
                new Composing(shared), new Composing(shared),
                new Composing(shared), new Composing(shared) };
        for(Composing c : composing)
        {
            c.dispose();
        }
        System.gc();
        new Composing(new Shared());
        System.gc();
    }
}