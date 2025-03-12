package com.trkn.level2.enumTest;

import java.util.Arrays;

public class EnumRunner {
    public static void main(String[] args) {
        ProcessorType bit32 = ProcessorType.BIT_32;
        System.out.println(bit32);
        System.out.println(ProcessorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(ProcessorType.values()));
        System.out.println(ProcessorType.BIT_32.ordinal());
        System.out.println(bit32.getName());
        System.out.println(bit32.getDescription());
    }
}
