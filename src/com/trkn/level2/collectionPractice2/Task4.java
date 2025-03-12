package com.trkn.level2.collectionPractice2;

//4. Сложить два многочлена заданной степени, если коэффициенты многочлена хранятся в объекте HashMap в виде:
//Ключ: номер степени
//Значение: значение множителя
//Вывести результирующий многочлен в виде строки: ax^6 + bx^4 + cx^3 + dx + 8

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer,Integer> pol1 = Map.of(
                0,5,
                1,3,
                3,2,
                5,4,
                6,7
        );
        Map<Integer,Integer> pol2 = Map.of(
                0,5,
                3,4,
                5,5,
                6,1
        );
        System.out.println(toString(sum(pol1,pol2)));
    }

    private static Map<Integer,Integer> sum(Map<Integer,Integer> pol1, Map<Integer,Integer> pol2) {
        Map<Integer,Integer> result = new HashMap<>(pol1);
        for (Map.Entry<Integer, Integer> entry : pol2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }

    private static String toString(Map<Integer,Integer> map) {
        Map<Integer,Integer> temp = new TreeMap<>(map).reversed();
        List<String> list = new ArrayList<>(temp.size());
        for (Map.Entry<Integer, Integer> entry : temp.entrySet()) {
            String value = entry.getKey()==0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue()+"x^"+entry.getKey();
            list.add(value);
        }
        return String.join(" + ", list);
    }
}
