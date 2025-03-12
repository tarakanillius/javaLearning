package com.trkn.level2.lesson20.map;

import com.trkn.level2.lesson20.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person person1 = new Person(1, "1", "1");
        Person person2 = new Person(2, "2", "2");

        Map<Integer, Person> map = new HashMap<>();
        map.put(person1.getId(), person1);
        map.put(person2.getId(), person2);

        System.out.println(map.get(2).getFirstName());
    }
}
