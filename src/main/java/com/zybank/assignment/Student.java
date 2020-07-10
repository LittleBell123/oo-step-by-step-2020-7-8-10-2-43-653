package com.zybank.assignment;

public class Student {
    private String name;
    private int age;
    private int klass;

    public Student(String name, int age, int klass) {
        this.name = name;
        this.age = age;
        this.klass = klass;
    }

    public String introduce() {
        return "My name is " + name + ". I am " + age + " years old. I am a Student of Class " + klass + ".";
    }
}
