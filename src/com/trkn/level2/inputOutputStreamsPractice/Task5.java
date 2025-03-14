package com.trkn.level2.inputOutputStreamsPractice;

//5. Задан файл с java-кодом. Прочитать текст программы из файла и
//записать в другой файл в обратном порядке символы каждой строки.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Task5 {
    public static void main(String[] args) throws IOException {
        Path original = Path.of("resources","Task4original.txt");
        Path updated = Path.of("resources","Task5updated.txt");
        List<String> reversedLines = Files.readAllLines(original).stream()
                .map(line -> new StringBuilder(line).reverse().toString())
                .toList();
        Files.write(updated, reversedLines, StandardOpenOption.CREATE);
    }
}
