package com.bupt.thinkinjava.c10;

import static com.bupt.utils.Print.print;

/**
 * 匿名内部类实现继承；
 */
class Test05{
    public Test05(String str){
        System.out.println("new Test05 "+str);
    }
    public void f(){
        print("========");
    }

}

class GetTest05{

        public Test05 get01(){
           return new Test05("From GetTest05 get01");
       }

       public Test05 get02(){
            return new Test05("From GetTest05 get02"){
                @Override
                public void f() {
                    print("+++++++");
                }
            };
       }


}
public class P15 {
    public static void main(String[] args) {
        GetTest05 getTest05=new GetTest05();
        getTest05.get01();
        getTest05.get02().f();
    }
}
