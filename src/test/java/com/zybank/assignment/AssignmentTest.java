package com.zybank.assignment;

import com.thoughtworks.basic.Dependency;
import com.thoughtworks.basic.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AssignmentTest {
    @Test
    public void person_test() {
        // given
        Person person = new Person("Tom",21);

        // when
        String actual = person.introduce();

        //then
        assertEquals(actual,"My name is Tom. I am 21 years old.");
    }

    @Test
    public void student_class_test() {
        // given
        Student student = new Student("Tom", 21, new Klass(2));

        // when
        String actual = student.introduce();

        // then
        assertEquals(actual, "My name is Tom. I am 21 years old. I am a Student of Class 2.");
    }

    @Test
    public void teacher_class_test() {
        // given
        Teacher teacher = new Teacher("Matt", 30, "Teacher", new Klass(1));

        // when
        String actual = teacher.introduce();

        //then
        assertEquals(actual,"My name is Matt. I am 30 years old. I am a Teacher.");
    }


}
