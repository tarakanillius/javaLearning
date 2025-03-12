package com.trkn.level2.lesson21Exception;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println(finallyTest());
            unsafe(5);
        } catch (FileNotFoundException | TimeoutException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally");
        }

        try {
            runtime();
        } catch (RuntimeException e) {
            e.printStackTrace();
            System.out.println(" !");
        }
    }

    public static int finallyTest(){
        try{
            return 2;
        } catch (Throwable throwable){
            return 3;
        } finally {
            return 4;
        }
    }

    public static void runtime(){
        throw new RuntimeException();
    }


    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        if (value > 0){
            throw new FileNotFoundException();
        }
    }


}
