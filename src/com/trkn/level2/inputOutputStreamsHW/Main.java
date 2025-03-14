package com.trkn.level2.inputOutputStreamsHW;

import java.io.IOException;
import java.nio.file.Path;

import static com.trkn.level2.inputOutputStreamsHW.FileUtil.*;

public class Main {
    public static void main(String[] args){
        Path names = Path.of("src", "com", "trkn", "level2", "inputOutputStreamsHW", "items-name.csv");
        Path prices = Path.of("src", "com", "trkn", "level2", "inputOutputStreamsHW", "items-price.csv");
        Path result = Path.of("src", "com", "trkn", "level2", "inputOutputStreamsHW", "result.csv");
        Path errors = Path.of("src", "com", "trkn", "level2", "inputOutputStreamsHW", "errors.csv");

        try {
            mergeFiles(names, prices ,result, errors);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
