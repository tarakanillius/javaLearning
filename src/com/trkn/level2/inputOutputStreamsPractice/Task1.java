package com.trkn.level2.inputOutputStreamsPractice;

//1. Задан файл с текстом, найти и вывести в консоль все слова,
//начинающиеся с гласной буквы.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources","Task1.txt");
        try (Stream<String> lines = Files.lines(path)) {
            lines.flatMap(line -> Arrays.stream(line.split(" "))
                    .map(String::trim))
                    .filter(s -> s.matches("[aeiouyAEIOUY].*"))
                    .forEach(System.out::println);
        }
    }
}
