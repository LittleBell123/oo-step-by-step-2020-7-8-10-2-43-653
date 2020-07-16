package com.zybank.assignment;

public class Demo {
    public static void main (String[] args) {
        Klass klassOne = new Klass(1);
        Klass klassTwo = new Klass(2);

        Person Teacher1 = new Teacher("老师1",30, "Teacher", klassOne);
        Person Teacher2 = new Teacher("老师2",30, "Teacher", klassTwo);

        Person student1 = new Student("Tom", 21, klassOne);
        Person student2 = new Student("Lily", 21, klassOne);

        Person student4 = new Student("Karen", 21, klassTwo);

        System.out.println("");
        System.out.println("-------------------------Tom 改名为 Tom2，只通知本班人员。-----------------");
        student1.setName("Tom2");
        System.out.println("");

        System.out.println("---------Lily 从 班级1 换到 班级2，通知原班级人员，通知现班级人员。------------");
        ((Student) student2).setKlass(klassTwo);


    }
}
