package com.trkn.level2.funcProgHW;

import java.util.*;
import static java.util.stream.Collectors.*;

public class Main {
    record CourseStats(List<Student> students, double avgGrade) {}

    public static void main(String[] args) {
        var students = Arrays.asList(
                new Student("Student1","Student1",1, new double[]{5.0, 9.0, 5.0}),
                new Student("Student222","Student222",5, new double[]{10.0, 9.0, 10.0}),
                new Student("Student22","Student22",5, new double[]{0.0, 0.0, 0.0}),
                new Student("Student3","Student3",2, new double[]{4.0, 6.0}),
                new Student("aaa","aaa",7, new double[]{7.0, 8.0})
        );

        var map1 = students.stream()
                .filter(s -> s.grades().length >= 3)
                .collect(toMap(Student::universityCourse,
                        Student::getAverageGrade,
                        Double::sum,
                        TreeMap::new));

        var map2 = students.stream()
                .collect(groupingBy(Student::universityCourse,
                        TreeMap::new,
                        mapping(s -> new String[]{s.name(), s.surname()},
                                collectingAndThen(toList(),
                                        list -> {
                                            list.sort(Comparator.comparing(arr -> arr[0]));
                                            return list;
                                        }))));

        var map3 = students.stream()
                .collect(groupingBy(Student::universityCourse,
                        TreeMap::new,
                        collectingAndThen(toList(),
                                list -> {
                                    list.sort(Comparator.comparing(Student::name));
                                    return new CourseStats(list,
                                            list.stream().mapToDouble(Student::getAverageGrade).average().orElse(0.0));
                                })));

        map1.forEach((k, v) -> System.out.printf("%d %.2f%n", k, v));
        map2.forEach((k, v) -> v.forEach(s -> System.out.printf("%d %s %s%n", k, s[0], s[1])));
        map3.forEach((k, v) -> {
            System.out.println(k);
            v.students().forEach(s -> System.out.printf("%s %s%n", s.name(), s.surname()));
            System.out.printf("%.2f%n", v.avgGrade());
        });
    }
}
