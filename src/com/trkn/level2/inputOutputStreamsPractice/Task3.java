package com.trkn.level2.inputOutputStreamsPractice;

//3. Задан файл с текстом. В каждой строке найти и вывести
//наибольшее число цифр, идущих подряд.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "Task3.txt");
        Pattern digitPattern = Pattern.compile("\\d+");

        Files.lines(path)
                .map(line -> digitPattern.matcher(line)
                        .results()
                        .map(match -> match.group().length())
                        .max(Integer::compare)
                        .orElse(0))
                .forEach(System.out::println);
    }
}
