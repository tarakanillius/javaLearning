package com.trkn.level2.collectionPractice2;

//3. Написать метод isUnique, который принимает Map&lt;String, String&gt;
//и возвращает true, если каждому ключу соответствуют свое уникальное значение.
//Например, в данном случае вернётся true: {Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins}
//А в данном false: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges,Hal=Perkins}

import java.util.HashSet;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String,String> trueMap = Map.of(
                "Marty", "Stepp",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Amanda", "Camp",
                "Hal", "Perkins"
        );
        Map<String, String> falseMap = Map.of(
                "Kendrick", "Perkins",
                "Stuart", "Reges",
                "Jessica", "Miller",
                "Bruce", "Reges",
                "Hal", "Perkins"
        );
        System.out.println(isUnique(falseMap));
    }

    private static boolean isUnique(Map<String, String> map) {
        return new HashSet<>(map.values()).size() == map.values().size();
    }
}
