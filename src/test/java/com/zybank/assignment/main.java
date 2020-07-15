package com.zybank.assignment;

public class main {
    public static void main (String[] args) {
        Klass klassOne = new Klass(1);
        Klass klassTwo = new Klass(2);

        Person student1 = new Student("Tom", 21, klassOne);
        Person student2 = new Student("Lily", 21, klassOne);
        Person student3 = new Student("Rose", 20, klassOne);

        Person student4 = new Student("Karen", 21, klassTwo);
        Person student5 = new Student("Tony", 22, klassTwo);

        Person Teacher1 = new Teacher("老师1",30, "Teacher", klassOne);
        Person Teacher2 = new Teacher("老师1",30, "Teacher", klassTwo);



    }
}
