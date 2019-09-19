package com.bupt.thinkinjava.c3;

import com.bupt.thinkinjava.c3.Rank;

import static com.bupt.utils.Print.print;


class Dog{
    String name;
    String says;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", says='" + says + '\'' +
                '}';
    }
}
public class P5 {
    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        dog1.name="spot";
        dog1.says="Ruff!";
        print(dog1.toString());

        dog2.name="scruff";
        dog2.says="Wurf!";
        print(dog2.toString());

    }
}
