package com.trkn.level2.lesson10;

// Замена грустных смайликов на веселые
public class Task1 {
    public static void main(String[] args) {
        String string = "asédkfaédk :( daksjd :( ( :) dkepqoiipq :)";
        System.out.println(replace(string));
    }

    public static String  replace(String string){
        return string.replace(":(",":)");
    }
}
