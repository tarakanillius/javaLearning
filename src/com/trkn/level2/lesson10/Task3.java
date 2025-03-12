package com.trkn.level2.lesson10;

// Написать функцию, которая принимает три параметра (имя, фамилию и отчество) и возвращает инициалы в формате "Ф.И.О.", учест регистр букв.
public class Task3 {
    public static void main(String[] args) {
        String name = "Nikita";
        String secondName = "efremov";
        String middleName = "Abramovich";
        System.out.println(convert(name, secondName, middleName));
    }

    public static String convert (String name, String secondName, String middleName){
        return secondName.substring(0, 1).toUpperCase() + "." + name.substring(0, 1).toUpperCase() + "." + middleName.substring(0, 1).toUpperCase() + ".";
    }
}
