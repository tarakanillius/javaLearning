package com.trkn.level2.collectionPractice;

import java.util.List;
import java.util.ListIterator;

public final class ArrayUtil {
    private ArrayUtil() {}

    public static void addStringIf(List<String> array, String stringToAdd, int size) {
        ListIterator<String> iterator = array.listIterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            if (element.length() >= size){
                iterator.set(stringToAdd);
                iterator.add(element);
            }
        }
    }
}
