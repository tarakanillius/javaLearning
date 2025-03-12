package com.trkn.level2.testMain;

public class Com implements Printable{
    private final String name;
    private final int age;

    public Com(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public void print() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
