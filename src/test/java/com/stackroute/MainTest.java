package com.stackroute;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class MainTest {

    private static Student student;
    private static StudentSorter studentSorter;

    @BeforeClass
    public static void setup() {
        // This methods runs, before running any one of the test case
        // This method is used to initialize the required variables
        studentSorter = new StudentSorter();

    }

    @AfterClass
    public static void teardown() {
        // This method runs, after running all the test cases
        // This method is used to clear the initialized variables
        studentSorter = null;
    }


    @Test
    public void sort() {
        Student s1 = new Student();
        s1.setAge(19);
        s1.setId(1);
        s1.setName("aaaa");

        Student s2 = new Student();
        s2.setAge(19);
        s2.setId(5);
        s2.setName("bbbb");

        Student s3 = new Student();
        s3.setAge(21);
        s3.setId(2);
        s3.setName("cccc");

        Student s4 = new Student();
        s4.setAge(23);
        s4.setId(8);
        s4.setName("dddd");

        Student s5 = new Student();
        s5.setAge(20);
        s5.setId(0);
        s5.setName("zzzzz");

        List<Student> sList = new ArrayList<>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);
        sList.add(s5);

        List<Student> exp = new ArrayList<>();
        exp.add(s4);
        exp.add(s3);
        exp.add(s5);
        exp.add(s2);
        exp.add(s1);

        Collections.sort(sList, studentSorter);
        assertEquals(exp, sList);
    }

    @Test
    public void sortNotNull() {
        Student s1 = new Student();
        s1.setAge(19);
        s1.setId(1);
        s1.setName("aaaa");

        Student s2 = new Student();
        s2.setAge(19);
        s2.setId(5);
        s2.setName("bbbb");

        Student s3 = new Student();
        s3.setAge(21);
        s3.setId(2);
        s3.setName("cccc");

        Student s4 = new Student();
        s4.setAge(23);
        s4.setId(8);
        s4.setName("dddd");

        Student s5 = new Student();
        s5.setAge(20);
        s5.setId(0);
        s5.setName("zzzzz");

        List<Student> sList = new ArrayList<>();
        sList.add(s1);
        sList.add(s2);
        sList.add(s3);
        sList.add(s4);
        sList.add(s5);

        Collections.sort(sList, studentSorter);

        assertNotNull(sList);
    }
}
