package com.mytasks.oop.game.module;

public class Car {
    private static boolean start = false;
    private static int currentSpeed = 0;
    private static int reducing = 5;
    private static int acceleration = 5;
    private static int allowedSpeed = 60;

    public static void checkStageOfEngine() {
        if (start) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }

    public static void startTheCar() throws InterruptedException {
        if (start) {
            System.out.println("Engine has already turned on");
        } else {
            System.out.println("You are turning the engine on");
            Thread.sleep(1000);
            Car.start = true;
            checkStageOfEngine();
            System.out.println("You can drive now");
        }
    }

    public static void driveTheCar() throws InterruptedException {
        if (start && currentSpeed == 0) {
            System.out.println("The car is accelerating");
            while (currentSpeed != allowedSpeed) {
                Thread.sleep(500);
                currentSpeed += acceleration;
                checkSpeed();
            }
        } else if (!start) {
            System.out.println("First you should turn the engine on to drive the car  ");
        } else {
            System.out.println("You are driving the car with speed: " + currentSpeed);
        }
    }

    public static void turnOffTheEngine() throws InterruptedException {
        if (currentSpeed == 0 && start) {
            System.out.println("You are turning the engine off");
            Thread.sleep(1000);
            start = false;
            System.out.println("The engine has turned off");
        } else if (currentSpeed != 0 && start) {
            System.out.println("You can not turn engine off,\nBecause car is moving with speed: " + currentSpeed);
            System.out.println("For turning off the engine, car should be stopped");
        } else {
            System.out.println("You can not turn the engine off because it is turned off now");
        }
    }

    public static void reduceTheSpeed() throws InterruptedException {
        if (currentSpeed != 0 && start) {
            checkSpeed();
            System.out.println("Car is going to stop");
            while (currentSpeed != 0) {
                currentSpeed -= reducing;
                Thread.sleep(500);
                checkSpeed();
            }
            System.out.println("Car has stopped");
        } else if (!start) {
            System.out.println("Car is standing now with turned the engine off");
        } else {
            System.out.println("Car is standing now with turned the engine on");
        }
    }

    public static void checkSpeed() {
        System.out.println("Current speed : " + currentSpeed);
    }
}
