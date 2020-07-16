package com.zybank.assignment;

import java.util.ArrayList;
import java.util.List;

public class Klass {
    private List<Student> students = new ArrayList<Student>();
    private Teacher teacher ;
    private int klassID;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Klass (int klassID) {
        this.klassID = klassID;
    }

    public Person getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void deleteStudent(Person student){
        students.remove(student);
    }

    public void infoChangedNotifiy(Student student) {
        for (Student studentElement : this.students) {
            if (!studentElement.getName().equals(student.getName())) {
                studentElement.noticeOthers(student);
            }
        }
        teacher.noticeOthers(student);
    }

    public void klassChangedNotifiy(Student student) {
        for (Student studentElement : this.students) {
            if (!studentElement.getName().equals(student.getName())) {
                studentElement.noticePreKlass(student);
            }
        }
        teacher.noticePreKlass(student);
    }

    public void newklassNotifiy(Student student) {
        for (Student studentElement : this.students) {
            if (!studentElement.getName().equals(student.getName())) {
                studentElement.noticeNewKlass(student);
            }
        }
        teacher.noticeNewKlass(student);
    }

    public int getKlassID() {
        return klassID;
    }
}
