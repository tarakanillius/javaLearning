package com.trkn.level2.lesson21Exception;

public class TestException extends Exception{

    public TestException(RuntimeException message) {
        super(message);
    }
}
