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
        assertEquals(actual,"My name is Tom. I am 21 years old.");
    }
}
