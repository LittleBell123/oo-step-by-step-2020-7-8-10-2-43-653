package com.zybank.assignment;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.klass.addStudent(this);
    }

    public void setKlass(Klass klass) {
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student of Class " + this.klass.getKlassID() + ".";
    }

    public void noticed(Person person) {
        System.out.println(" My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a student of Class " + this.klass.getClass() + " now.");
    }
}
