package com.trkn.level2.lesson10;

// Подсчитать количество точек, запятых и восклицательных знаков в строке
public class Task4 {
    public static void main(String[] args) {
        String string = "Test, dsaksd! Daksdaéksd. Dkasldk, asdasd.";
        System.out.println(check(string));
    }

    public static int check(String string){
        int count = 0;
        for (char c : string.toCharArray()) {
            if (c == '.' || c == ',' || c == '!') {
                count++;
            }
        }
        return count;
    }
}
