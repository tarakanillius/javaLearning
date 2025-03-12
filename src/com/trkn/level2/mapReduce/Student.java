package com.trkn.level2.mapReduce;

public record Student(int age, String name) {

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
