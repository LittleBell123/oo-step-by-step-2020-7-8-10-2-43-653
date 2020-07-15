package com.zybank.assignment;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private List<Person> students = new ArrayList<Person>();
    private Person teacher ;
    private int klassID;

    public Klass (int klassID) {
        this.klassID = klassID;
    }

    public void addStudent(Person student){
        students.add(student);
    }

    public void addTeacher(Person teacher){
        students.add(teacher);
    }

    public void deleteStudent(Person student){
        students.add(student);
    }

    public void infoChangedNotifiy(Person student) {
        for (Person studentElement : students ) {
            studentElement.noticed(student);
        }
        teacher.noticed(student);
    }

    public int getKlassID() {
        return klassID;
    }
}
