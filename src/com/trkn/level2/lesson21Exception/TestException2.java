package com.trkn.level2.lesson21Exception;

public class TestException2 extends RuntimeException{
    public TestException2(String message) {
        super(message);
    }

    public TestException2(Throwable cause) {
        super(cause);
    }
}
