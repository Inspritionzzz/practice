package com.bupt.thinkinjava.c9;

import static com.bupt.utils.Print.print;
import static com.bupt.utils.Print.printnb;

/**
 * 字符数组和字符串的转变
 * 重载父类的方法参数问题：参数不能变；
 */
class Test6 extends Processor{

    String process(Object input){
        char[] chars=((String)input).toCharArray();
        char temp;
        String str=null;
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<(chars.length/2);i++){
            temp=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1]=temp;
        }
//        for (char c:chars
//             ) {
//            printnb(c);
//        }
        for(int i=0;i<chars.length;i++){
            str=stringBuilder.append(chars[i]).toString();
        }
        return str;
    }
}
class Test7 extends Processor{
    @Override
    String process(Object input) {
        StringBuilder s=new StringBuilder((String)input);
        String str=null;
        //char temp;
        for(int i=0;i<s.length()-1;i+=2){
            char temp1=s.charAt(i);
            char temp2=s.charAt(i+1);
            s.setCharAt(i,temp2);
            s.setCharAt(i+1,temp1);
        }
        return s.toString();
    }
}

public class P11 {
    public static void main(String[] args) {
        //Test6 test6=new Test6();
        //print(test6.process("ABCD"));
        String s="ABCD";
        Apply.process(new Test6(),s);
        Apply.process(new Test7(),s);
    }
}
