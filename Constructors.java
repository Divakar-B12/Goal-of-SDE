package com.FAANG.Day8;

public class Constructors {



    public static void main(String[] args) {
        Person p1 = new Person("Divakar", 24, 'M');
        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p1.gender);
    }
}


class Person{
    String name;
    int age;
    char gender;

    public Person(String name, int age, char gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    Person(){

    }
}