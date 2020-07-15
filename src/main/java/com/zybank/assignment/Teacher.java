package com.zybank.assignment;

public class Teacher extends Person{
    private Klass klass;
    private String job;

    public Teacher(String name, int age, String job, Klass klass) {
        super(name, age);
        this.job = job;
        this.klass = klass;
        this.klass.addTeacher(this);
    }

    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a " + this.job + ".";
    }

    public void noticed() {
        System.out.println(" My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a student of Class " + klass.getKlassID() + " now.");
    }
}
