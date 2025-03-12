package com.trkn.level2.lesson20;

public class PersonExample {
    public static void main(String[] args) {
        Person person1 = new Person(1, "1", "1");
        Person person2 = new Person(1, "1", "1");

        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());
        System.out.println(person1.equals(person2));
    }
}
