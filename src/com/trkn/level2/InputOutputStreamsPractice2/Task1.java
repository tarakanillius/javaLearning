package com.trkn.level2.InputOutputStreamsPractice2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) throws IOException {
        Path original = Path.of("resources","Poem.txt");
        Path result = Path.of("resources","PoemResult.txt");
        Files.writeString(result, Arrays.stream(Files.readString(original)
                        .replaceAll("[.,!?— -:]", "")
                        .replaceAll("\\s+", "")
                        .toLowerCase()
                        .split(""))
                .collect(Collectors.groupingBy(c -> c, TreeMap::new, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getKey() + " - " + e.getValue())
                .collect(Collectors.joining("\n"))
        );
    }
}
