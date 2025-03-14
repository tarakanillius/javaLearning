package com.trkn.level2.inputOutputStreams;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class FileRunner {
    public static void main(String[] args) throws IOException {
        File file = new File("resources/text.txt");
        System.out.println(file.createNewFile());
        System.out.println(file.exists());
        System.out.println(file.toURI());
        File filee = new File("src/com/trkn/level2");
        Arrays.stream(filee.listFiles()).forEach(System.out::println);

    }
}
