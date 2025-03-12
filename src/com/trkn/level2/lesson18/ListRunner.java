package com.trkn.level2.lesson18;

public class ListRunner {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("Test");
        Object o = list.get(0);
        System.out.println(o);
        System.out.println(o.getClass().getName());
    }
}