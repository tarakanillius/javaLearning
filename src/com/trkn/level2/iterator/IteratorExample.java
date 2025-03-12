package com.trkn.level2.iterator;

import java.util.ArrayList;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> array = new ArrayList<>(list);

//        for (Integer integer : list) {
//            System.out.println(integer);
//        }


//        for (Iterator<Integer> iteratorr = list.iterator(); iteratorr.hasNext();) {
//            Integer next = iteratorr.next();
//            System.out.println(next);
//        }

        array.removeIf(next -> next == 4);

        System.out.println(array);

    }
}
