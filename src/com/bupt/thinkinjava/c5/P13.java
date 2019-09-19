package com.bupt.thinkinjava.c5;

/**
 * 显示的静态初始化；
 */

class Student{

      Student(int i){
          System.out.println("student"+i);
      }

      void stu(int i){
          System.out.println("stu1"+i);
      }
}

class Students{

    static Student student1;
    static Student student2;

    static {
        student1=new Student(1);
        student2=new Student(2);
    }


}

public class P13 {
    public static void main(String[] args) {

        //Students.student1.stu(1);//一条语句把student1和student2都初始化了

        Students students=new Students();//和上条语句一样的作用
    }
}
