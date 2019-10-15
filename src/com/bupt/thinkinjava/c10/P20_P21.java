package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 接口内部定义嵌套类；
 * 嵌套类中的内部类不能有static方法；
 * 在嵌套类的外部类中写一个static方法，接受一个接口的实现的一个实例，在main方法中尝试执行这个静态方法；
 *
 *
 */
public interface P20_P21{
    class Outter{

        public Outter(){print("new Outter()");}
        class Inner{
            public Inner(){
                print("new Inner()");
            }

            //内部类中不能有静态方法；
            //static void f(P20_P21 p20_p21){p20_p21.ff();}
        }
        Inner getInner(){return new Inner();}
        static void f(P20_P21 p20_p21){p20_p21.ff();}
    }


     void ff();

    public static void main(String[] args) {
        P20_P21 test01=new Test01();
        P20_P21.Outter outter=new Outter();
        outter.getInner();

        P20_P21 p20_p21=new P20_P21() {
            @Override
            public void ff() {
                print("");
            }
        };
        P20_P21.Outter.f(p20_p21);

    }
}

class Test01 implements P20_P21{
    @Override
    public void ff() {

    }
}


