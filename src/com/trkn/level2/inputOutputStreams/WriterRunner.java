package com.trkn.level2.inputOutputStreams;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class WriterRunner {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        Path path = Path.of("resources", "writer2.txt");
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path,true))) {

//        Files.write(path, List.of("test","test2"));

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            for(int i = 0; i < 10000; i++) {
                String randomValue = String.valueOf(random.nextInt(99999999, 999999999)).repeat(10);
                writer.append(LocalTime.now().toString()).append(" ").append(randomValue);
                writer.newLine();
            }
        }
    }
}
