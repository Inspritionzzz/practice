package com.bupt.thinkinjava.c7;

class book{
    String name;
    book(String name){
        this.name=name;
    }
}
class Page extends book{
    Page(String name){
        super(name);
        System.out.println("创建了Page对象");
    }
}
public class P6 {
    public static void main(String[] args) {
        new Page("Page");
    }
}
