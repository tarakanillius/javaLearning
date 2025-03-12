package com.trkn.level2.lambda;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Comparator<Integer> comparator = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return Integer.compare(o1, o2);
//            }
//        };
        Comparator<Integer> comparator = Integer::compare;
        System.out.println(comparator.compare(25,100));
    }

//    private static class IntegerComporator implements Comparator<Integer>{

//        @Override
//        (Integer o1, Integer o2) {
//             return Integer.compare(o1, o2);
//        }
//    }
}
