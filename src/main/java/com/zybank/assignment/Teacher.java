package com.zybank.assignment;

public class Teacher extends Person{
    private String job;

    public Teacher(String name, int age, String job) {
        super(name, age);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a " + this.getJob() + ".";
    }
}
