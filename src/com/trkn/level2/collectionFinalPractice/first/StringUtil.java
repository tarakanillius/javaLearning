package com.trkn.level2.collectionFinalPractice.first;

import java.util.HashMap;
import java.util.List;

public final class StringUtil {
    public StringUtil() {}

    public static HashMap<String,Integer> getUniqueWords(String text) {
        HashMap<String,Integer> result = new HashMap<>();
        List<String> strings = List.of(text.trim().split("[ ,.!]+"));
        for (String word : strings) {
            result.merge(word, 1, Integer::sum);
        }
        return result;
    }
}
