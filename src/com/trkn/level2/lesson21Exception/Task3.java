package com.trkn.level2.lesson21Exception;

//3.Создать собственный класс-исключение - наследник класса Exception.
//Создать метод, выбрасывающий это исключение.
//Вызвать этот метод и отловить исключение. Вывести stack trace в консоль.
public class Task3 {
    public static void main(String[] args) {
        try {
            unsafe();
        } catch (TestException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void unsafe() throws TestException {
        throw new TestException(new RuntimeException("runtime"));
    }
}
