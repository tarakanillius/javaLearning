package com.trkn.level2.inputOutputStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
    public static void main(String[] args) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(Path.of("resources", "text.txt").toFile())) {
            byte[] bytes = new byte[fileInputStream.available()];
            int counter = 0;
            byte currentByte;
            while((currentByte = (byte)fileInputStream.read()) != -1){
                bytes[counter++] = currentByte;
            }
            System.out.println(new String(bytes));
//            byte[] bytes = fileInputStream.readAllBytes();
//            String s = new String(bytes);
//            System.out.println(s);
        }
    }
}
