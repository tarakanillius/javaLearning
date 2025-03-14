package com.trkn.level2.InputOutputStreamsPractice2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Random;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        Path path = Path.of("resources", "RandomNumbers.txt");
        StringBuilder stringBuilder = new StringBuilder();

        IntStream.range(0, 100).forEach(i -> {
            int size = random.nextInt(1, 10);
            IntStream.range(0, size).forEach(j ->
                    stringBuilder.append(random.nextInt(1, 10))
            );
            stringBuilder.append("\n");
        });
        writeToFile(path, stringBuilder.toString());
        TreeSet<Integer> map = Files.readString(path)
                .lines()
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(TreeSet::new));
        String sortedNumbers = map.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("\n")) + "\n\n";
        writeToFile(path, sortedNumbers);
    }

    public static void writeToFile(Path pathToFile, String string) throws IOException {
        Files.writeString(pathToFile, string, StandardOpenOption.TRUNCATE_EXISTING);
    }
}