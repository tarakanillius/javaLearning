package com.trkn.level2.inputOutputStreamsPractice;

//2.Задан файл с текстом, найти и вывести в консоль все слова, для
//которых последняя буква одного слова совпадает с первой буквой
//следующего слова

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "Task2.txt");
        try (Scanner scanner = new Scanner(path)) {
            if (!scanner.hasNext()) {
                return;
            }
            String prev = scanner.next().toLowerCase();
            while (scanner.hasNext()) {
                String current = scanner.next().toLowerCase();
                prev = cleanWord(prev);
                current = cleanWord(current);
                char lastChar = prev.charAt(prev.length() - 1) == 'ь' ? prev.charAt(prev.length() - 2) : prev.charAt(prev.length() - 1);
                if (lastChar == current.charAt(0)) {
                    System.out.println(prev + " " + current);
                }
                prev = current;
            }
        }
    }

    private static String cleanWord(String word) {
        return word.replaceAll("[.,!?]$", "");
    }
}
