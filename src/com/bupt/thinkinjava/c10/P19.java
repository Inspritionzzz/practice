package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 内部类的嵌套，观察编译后生成的.class文件的名称；
 */
class TestInner01{
    public TestInner01() {
        print("TestInner01()");
    }

    class TestInner02{
        public TestInner02() {
            print("TestInner02()");
        }

        class TestInner03{
            public TestInner03() {
                print("TestInner03()");
            }
        }
    }
}
public class P19 {
    public static void main(String[] args) {
        //TestInner01.TestInner02.TestInner03 testInner03=new TestInner01.TestInner02.TestInner03();
        //TestInner01.TestInner02 testInner02=new TestInner01.TestInner02();
        TestInner01 testInner01=new TestInner01();
        TestInner01.TestInner02 testInner02= testInner01.new TestInner02();
        TestInner01.TestInner02.TestInner03 testInner03=testInner02.new TestInner03();

    }
}
