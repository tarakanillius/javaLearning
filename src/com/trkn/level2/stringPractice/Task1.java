package com.trkn.level2.stringPractice;

public class Task1 {
    public static void main(String[] args) {
        String string = "aBc Cba";
        System.out.println(check(string));
    }

    public static boolean check(String string) {
        char[] chars = string.replaceAll("\\s", "").toLowerCase().toCharArray();
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) return false;
        }
        return true;
    }
}
