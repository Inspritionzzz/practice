package com.bupt.thinkinjava.c3;

import static com.bupt.utils.Print.print;

/**
 * 展示别名机制
 */

class Rank{
    float level;
}
public class P2 {
    public static void main(String[] args){
        Rank rank1=new Rank();
        Rank rank2=new Rank();

        rank1.level=3.0f;
        rank2.level=2.0f;
        print("rank1="+rank1.level+"+++++"+"rank2="+rank2.level);

        rank2=rank1;
        rank1.level=4.0f;
        print("rank1="+rank1.level+"+++++"+"rank2="+rank2.level);

        rank1.level=5.0f;
        print("rank1="+rank1.level+"+++++"+"rank2="+rank2.level);

        print(rank1+"+++++"+rank2);






    }
}
