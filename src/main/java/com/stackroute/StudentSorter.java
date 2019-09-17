package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        int temp = 0;
        temp = s2.getAge() - s1.getAge();
        if(temp == 0) {
            temp = s2.getName().compareTo(s1.getName());
        }
        if(temp == 0) {
            temp = s2.getId() - s1.getId();
        }
        return temp;
    }
}
