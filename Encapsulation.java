package com.FAANG.Day8;

public class Encapsulation {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Divakar");
        System.out.println(s1.getName());
        s1.setRollNumber(249);
        System.out.println(s1.getRollNumber());
        s1.setSection('E');
        System.out.println(s1.getSection());
        s1.setMarks(453);
        System.out.println(s1.getMarks());
    }
}

class Student{
   private String name;
   private int rollNumber;
   private char section;
   private int marks;

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public char getSection() {
        return section;
    }

    public int getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setSection(char section) {
        this.section = section;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
