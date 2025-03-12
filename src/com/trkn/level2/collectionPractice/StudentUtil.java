package com.trkn.level2.collectionPractice;

import java.util.List;

public final class StudentUtil {
    private StudentUtil() {}

    public static Student getBestStudent(List<Student> students) {
        Student bestStudent = null;
        for (Student student : students) {
            if (bestStudent == null || student.avgMark() > bestStudent.avgMark()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
