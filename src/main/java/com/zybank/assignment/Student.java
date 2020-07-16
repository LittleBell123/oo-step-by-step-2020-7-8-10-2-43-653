package com.zybank.assignment;

public class Student extends Person{
    private Klass klass;

    public Student(String name, int age, Klass klass) {
        super(name, age);
        this.klass = klass;
        this.klass.addStudent(this);
    }

    public void setName(String newName) {
        super.setName(newName);
        klass.infoChangedNotifiy(this);
    }

    public void setKlass(Klass klass) {
        this.klass.deleteStudent(this);
        Klass klassTmp = this.klass;
        klass.addStudent(this);
        this.klass = klass;
        System.out.println("通知原班级人员: ");
        klassTmp.klassChangedNotifiy(this);

        System.out.println("通知现班级人员: ");
        this.klass.newklassNotifiy(this);

    }

    public Klass getKlass() {
        return klass;
    }

    public String introduce() {
        return "My name is " + this.getName() + ". I am " + this.getAge() + " years old. I am a Student of Class " + this.klass.getKlassID() + ".";
    }

    public void noticeOthers(Student student) {
        System.out.println("Hi, " + this.getName() + " My name is changed as " + student.getName() + ". I am " + student.getAge() + " years old. I am a student of Class " + student.getKlass().getKlassID() + " .");
    }

    public void noticePreKlass(Student student) {
        System.out.println("Hi, " + this.getName() + " My name is " + student.getName() + ". I am " + student.getAge() + " years old. I am a student of Class " + student.getKlass().getKlassID() + " now.");
    }

    public void noticeNewKlass(Student student) {
        System.out.println("Hi, " + this.getName() + " My name is " + student.getName() + ". I am " + student.getAge() + " years old. I am a student of Class " + student.getKlass().getKlassID() + " now.");
    }

}
