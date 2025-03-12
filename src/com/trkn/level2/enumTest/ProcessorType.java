package com.trkn.level2.enumTest;

public enum ProcessorType implements Describable{
    BIT_32("bit-32"),
    BIT_64("bit-64");

    private final String name;

    ProcessorType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return name + " processor";
    }
}
