package com.trkn.level2.collectionPractice;

import com.trkn.level2.collectionPractice.comporator.StudentAgeComporator;
import com.trkn.level2.collectionPractice.comporator.StudentMarkComporator;
import com.trkn.level2.collectionPractice.comporator.StudentNameComporator;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static com.trkn.level2.collectionPractice.ArrayUtil.addStringIf;

public class Main {
    public static void main(String[] args) {
        List<String> array = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        addStringIf(array, "****", 4);
        System.out.println(array);

        List<Student> students = new ArrayList<>(List.of(
                new Student("Oleksandr", "Petrenko", 30, 4.5),
                new Student("Nikita","Kolosov", 25, 4.0),
                new Student("Vlad", "Kovalenko", 28, 4.2),
                new Student("Christina", "Evseeva", 25, 4.1),
                new Student("Dima", "Kovalenko", 28, 4.2),
                new Student("Elena","Melnik", 24, 4.3),
                new Student("Xenia","Melnik", 24, 4.3)
                ));

        students.forEach(System.out::println);
        System.out.println();
        System.out.println("Best student: " + StudentUtil.getBestStudent(students)+"\n");
        students.sort(new StudentNameComporator());
        students.forEach(System.out::println);
        System.out.println();
        students.sort(new StudentAgeComporator());
        students.forEach(System.out::println);
        System.out.println();
        students.sort(new StudentMarkComporator());
        students.forEach(System.out::println);

    }
}
