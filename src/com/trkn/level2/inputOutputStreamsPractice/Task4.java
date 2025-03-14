package com.trkn.level2.inputOutputStreamsPractice;

//4. Задан файл с java-кодом.Прочитать текст программы из файла и
//все слова public в объявлении атрибутов и методов класса заменить
//на слово private. Результат сохранить в другой заранее созданный
//файл.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Path original = Path.of("resources","Task4original.txt");
        Path updated = Path.of("resources","Task4updated.txt");
        String stringValue = Files.readString(original);
        String result = stringValue.replaceAll("public", "private");
        Files.writeString(updated, result, StandardOpenOption.CREATE);
    }
}
