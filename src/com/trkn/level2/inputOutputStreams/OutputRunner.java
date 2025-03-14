package com.trkn.level2.inputOutputStreams;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.Random;

public class OutputRunner {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        File file = Path.of("resources","output.txt").toFile();
        try (BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file,true))) {
            for(int i = 0; i < 10000; i++) {
                String randomValue = String.valueOf(random.nextInt(99999999, 999999999)).repeat(10);
                fileOutputStream.write((LocalTime.now() + " " + randomValue).getBytes());
                fileOutputStream.write(System.lineSeparator().getBytes());
            }
        }
    }
}
