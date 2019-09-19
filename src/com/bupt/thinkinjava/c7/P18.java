package com.bupt.thinkinjava.c7;

import java.util.Random;

/**
 * 测试static final和final的区别；
 */
class TestFinalAndStatic{
    private static Random random=new Random();
    static final int static_final_num=random.nextInt(20);
    final int final_num=random.nextInt(20);

    public static int getStatic_final_num() {
        return static_final_num;
    }

    public int getFinal_num() {
        return final_num;
    }
}
public class P18 {
    public static void main(String[] args) {
        System.out.println(new TestFinalAndStatic().getFinal_num());
        System.out.println(new TestFinalAndStatic().getFinal_num());
        System.out.println(new TestFinalAndStatic().getStatic_final_num());
        System.out.println(new TestFinalAndStatic().getStatic_final_num());
    }
}
