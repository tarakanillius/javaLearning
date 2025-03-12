package com.trkn.level2.testMain;

public interface Printable {
    String SOME_VALUE = "Some value";

    default void printValue(){
        System.out.println(SOME_VALUE);
    }

    void print();
}
