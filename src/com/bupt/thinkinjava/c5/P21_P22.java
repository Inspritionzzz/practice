package com.bupt.thinkinjava.c5;

/**
 * enum结合switch
 */

enum Money{
    ONE,TWO,THREE,FOUR,FIVE
}

class MoneyDescribe{

    Money money;

    public MoneyDescribe(Money money){
        this.money=money;
    }

    void describe(){
        switch (money){
            case ONE:   System.out.println("111");break;
            case TWO:   System.out.println("222");break;
            case THREE: System.out.println("333");break;
            case FOUR:  System.out.println("444");break;
            case FIVE:  System.out.println("555");break;
        }
    }

}
public class P21_P22 {

    public static void main(String[] args) {

        for(Money money:Money.values()){
            System.out.println(money+"  "+money.ordinal());
        }

        MoneyDescribe moneyDescribe=new MoneyDescribe(Money.ONE);
        moneyDescribe.describe();
    }


}
