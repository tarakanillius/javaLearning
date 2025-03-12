package com.trkn.level2.iterator;

import com.trkn.level2.lesson18.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("a");
        list.add("l");
        list.add("i");
        list.add("j");
        list.add("h");
        list.add("n");
        list.add("s");
        list.add("d");
        list.add("b");

        int[] temp = {0};
        list.iterator().forEachRemaining(element -> {if (element.equals("a")) temp[0]++;});
        System.out.println(temp[0]);
    }
}
