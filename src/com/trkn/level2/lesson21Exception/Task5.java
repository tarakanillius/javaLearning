package com.trkn.level2.lesson21Exception;

//5. Бросить одно из существующих в JDK исключений, отловить его и
//выбросить своё собственное, указав в качестве причины отловленное.

public class Task5 {
    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (TestException2 e) {
            System.out.println("catched");
            e.printStackTrace();
        }
    }

    public static void unsafe() {
        throw new RuntimeException("!");
    }

    public static void catchCustomException() {
        try{
            unsafe();
        } catch (RuntimeException e){
            System.out.println("? method");
            throw new TestException2(e);
        }
    }
}
