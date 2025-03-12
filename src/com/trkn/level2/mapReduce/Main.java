package com.trkn.level2.mapReduce;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Optional<Student> reduce = Stream.of(
                        new Student(19, "Ivan"),
                        new Student(20, "Petr"),
                        new Student(30, "Dmitriy"),
                        new Student(10, "Ehor"),
                        new Student(50, "Orest")
                )
                .sequential()
//                .map(Student::getAge)
                .filter(student -> student.age()<0)
                .reduce((student, student2) -> student.age() > student2.age() ? student : student2);

        reduce.ifPresent(System.out::println);
        Integer integer = reduce.map(Student::age)
                .filter(age -> age > 25)
                .orElse(0);

        System.out.println(integer);
    }
}
