package com.trkn.level2.collectionPractice.comporator;

import com.trkn.level2.collectionPractice.Student;

import java.util.Comparator;

public class StudentNameComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        String fullName1 = o1.surname()+o1.name();
        String fullName2 = o2.surname()+o2.name();
        return fullName1.compareTo(fullName2);
    }
}
