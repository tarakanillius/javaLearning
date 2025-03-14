package com.trkn.level2.serializationDeserialization;

import java.io.*;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Path path = Path.of("resources", "student.out");
//        writeObject(path);
        readObject(path);
    }

    private static void readObject(Path path) throws IOException, ClassNotFoundException {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path.toFile()))) {
            Object o = objectInputStream.readObject();
            System.out.println(o);
        }
    }

    private static void writeObject(Path path) throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path.toFile()))) {
            Person person1 = new Person(20, "Person1");
            objectOutputStream.writeObject(person1);
        }
    }
}
