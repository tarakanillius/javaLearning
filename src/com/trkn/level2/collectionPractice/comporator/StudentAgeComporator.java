package com.trkn.level2.collectionPractice.comporator;

import com.trkn.level2.collectionPractice.Student;

import java.util.Comparator;

public class StudentAgeComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.age(), o2.age());
    }
}
