package com.trkn.level2.stringExercise;

import java.util.HashSet;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {
        String string = "abc Cpddd Diabc Cpddd Dio OsfWwDKaséldkaé sda élkasdk qweoppq oweooqpewkasdpoak spoqpowdkapowkd paowk poaabc Cpddd Dio OsfWwDKaséldkaé sda élkasdk qweoppq oweooqpewkasdpoak spoqpowdkapowkd paowk poaabc Cpddd Dio OsfWwDKaséldkaé sda élkasdk qweoppq oweooqpewkasdpoak spoqpowdkapowkd paowk poaabc Cpddd Dio OsfWwDKaséldkaé sda élkasdk qweoppq oweooqpewkasdpoak spoqpowdkapowkd paowk poao OsfWwDKaséldkaé sda élkasdk qweoppq oweooqpewkasdpoak spoqpowdkapowkd paowk poa";
        System.out.println(filter(string));
    }

    public static String filter(String string) {
        Set<Character> set = new HashSet<>();
        StringBuilder result = new StringBuilder();
        for (char c:string.toUpperCase().toCharArray()) {
            if (!set.contains(c)&&c!=' ') {
                set.add(c);
                result.append(c);
            }
        }
        return result.toString();
    }
}
