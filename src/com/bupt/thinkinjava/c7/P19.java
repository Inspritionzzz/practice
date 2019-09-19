package com.bupt.thinkinjava.c7;

/**
 * 在构造器中必须把空白final初始化；
 */
class Aa{

}
class TestBlankFinal{
    private final Aa aa;
    TestBlankFinal(Aa aa){
        this.aa=aa;
    }

    public Aa getAa() {
        return aa;
    }
}
public class P19 {
    public static void main(String[] args) {
        Aa aa=new Aa();
        TestBlankFinal testBlankFinal=new TestBlankFinal(aa);
        testBlankFinal.getAa();
    }
}
