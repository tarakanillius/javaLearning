package com.trkn.level2.lesson19;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRunner {
    public static void main(String[] args) {
        //при overflow arraylist создает новый лист, копирует туда все элементы, и удаляет старый лист
        List<Integer> integers = new ArrayList<>(5);
        integers.add(0);
        integers.add(1);
        integers.add(2);
        integers.add(4);
        integers.add(5);
        integers.add(6);

        System.out.println();
    }
}
