package com.trkn.level2.lesson21Exception;

//4. Повторить предыдущее упражнение, но наследуя свой класс от класса RuntimeException.
//Добавить в конструктор своего класса возможность указания сообщения.

public class Task4 {
    public static void main(String[] args) {
        unsafe();
    }

    public static void unsafe() {
        throw new TestException2(" !");
    }
}
