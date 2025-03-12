package com.trkn.level2.collectionPractice.comporator;

import com.trkn.level2.collectionPractice.Student;

import java.util.Comparator;

public class StudentMarkComporator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.avgMark(), o2.avgMark());
    }
}
