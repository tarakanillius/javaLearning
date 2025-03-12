package com.trkn.level2.collectionPractice;


public record Student(String name, String surname, int age, double avgMark) {

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", avgMark=" + avgMark +
                '}';
    }
}
