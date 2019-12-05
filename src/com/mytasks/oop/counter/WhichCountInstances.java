package com.mytasks.oop.counter;

public class WhichCountInstances {
    private static int COUNTER = 0;

    public WhichCountInstances() {
        COUNTER++;
    }

    public static int getCOUNTER() {
        return COUNTER;
    }
}