package com.zybank.assignment;

public class Teacher extends Person{
    private Klass klass;
    private String job;

    public Teacher(String name, int age, String job, Klass klass) {
        super(name, age);
        this.job = job;
        this.klass = klass;
        this.klass.setTeacher(this);
    }

    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a " + this.job + ".";
    }

    public void noticeOthers(Student student) {
        System.out.println("Hi, " + getName() + ". My name is changed as " + student.getName() + ". I am " + student.getAge() + " years old. I am a student of Class " + student.getKlass().getKlassID() + " .");
    }

    public void noticeNewKlass(Student student) {
        System.out.println("Hi, " + getName() + ". My name is " + student.getName() + ". I am " + student.getAge() + " years old. I am a student of Class " + student.getKlass().getKlassID() + " now.");
    }

    public void noticePreKlass(Student student) {
        System.out.println("Hi, " + getName() + ". My name is " + student.getName() + ". I am " + student.getAge() + " years old. I am a student of Class " + student.getKlass().getKlassID() + " now.");
    }
}
