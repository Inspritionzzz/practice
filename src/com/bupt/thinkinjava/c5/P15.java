package com.bupt.thinkinjava.c5;

class Student1{
    String name;
    String hobby;

    {
        name="yu";
        hobby="study";
    }
}

public class P15 {
    public static void main(String[] args) {
       Student1 student=new Student1();
       System.out.println(student.name+student.hobby);
    }
}
