package com.bupt.thinkinjava.c7;
/**
 * 测试static final和final的区别:存储方式和初始化；
 */
class SelfCounter {
    private static int count;
    private int id = count++;
    public String toString() { return "SelfCounter " + id; }

    public static String getCount() {
        return "count="+count;
    }
}
class WithFinalFields {
    final SelfCounter scf = new SelfCounter();
    static final SelfCounter scsf = new SelfCounter();
    public String toString() {
        return "scf = " + scf + "\nscsf = " + scsf;
    }
}
public class P18a {
    public static void main(String args[]) {
        System.out.println("First object:");
        System.out.println(new WithFinalFields());
        System.out.println("Second object:");
        System.out.println(new WithFinalFields());
        System.out.println(SelfCounter.getCount());
    }
}