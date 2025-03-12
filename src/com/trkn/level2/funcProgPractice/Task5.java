package com.trkn.level2.funcProgPractice;

//5. Дан класс Person с полями firstName, lastName, age.
//Вывести полное имя самого старшего человека, у которого длина этого имени не превышает 15 символов.

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<Person> list = List.of(
                new Person("John", "Smith", 25),
                new Person("Jane", "Doe", 30),
                new Person("Bob", "Johnson", 35),
                new Person("Aliceeeeeeeeeeeeeeeeee", "Williams", 50),
                new Person("John", "Abcd", 40)
        );

        list.stream()
                .filter(person -> person.firstName().length() <= 15)
                .sorted((p1, p2) -> p2.age() - p1.age())
                .limit(1)
                .forEach(person -> System.out.println(person.firstName() + " " + person.lastName()));
    }
}
