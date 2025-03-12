package com.trkn.level2.funcProgHW;

import java.util.Arrays;

public record Student(String name, String surname, int universityCourse, double[] grades) {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", universityCourse=" + universityCourse +
                ", grades=" + Arrays.toString(grades) +
                '}';
    }

    public double getAverageGrade() {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
}
