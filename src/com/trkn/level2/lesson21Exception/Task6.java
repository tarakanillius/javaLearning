package com.trkn.level2.lesson21Exception;

//6. Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.
//Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class Task6 {
    private static final Map<Integer, Throwable> EXCEPTIONS = Map.of(
            0, new RuntimeException("runtime"),
            1, new FileNotFoundException("file not found"),
            2, new IndexOutOfBoundsException("index out of bounds")
    );

    public static void main(String[] args) {
        int i = new Random().nextInt(0, 3);
        try {
            unsafe(i);
        } catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (FileNotFoundException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Throwable e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void unsafe(int randomValue) throws Throwable {
        Throwable exception = EXCEPTIONS.getOrDefault(randomValue, new TestException2("not found"));
        throw exception;
    }
}
