package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * ①在方法中的内部类可以实现某个接口，并且可以使用这个方法返回一个此接口的引用；
 * ②在方法的作用域中定义内部类；
 */
public class P9_P10 {
    //public String string;

    public void getInner02(boolean flag){
        if(flag){
            class Inner03 implements C10_P9{
                @Override
                public void f1() {
                    print("在方法内的作用域内部实现了C10_P9接口");
                }
            }
            //只能在作用域内获得Inner03的对象
            Inner03 inner03=new Inner03();
            inner03.f1();
        }
        //无法返回对Inner03的引用
        //return new Inner03();

    }

    public C10_P9 getInner(){
            class Inner02 implements C10_P9{
            @Override
            public void f1() {
                print("在方法内部实现了C10_P9接口");
            }
            }
            return new Inner02();
    }
    public static void main(String[] args) {
        C10_P9 c10_p9=new P9_P10().getInner();
        //C10_P9 c10_p9=p9.getInner();
        c10_p9.f1();
        P9_P10 p9_p10=new P9_P10();
        p9_p10.getInner02(true);
    }
}
