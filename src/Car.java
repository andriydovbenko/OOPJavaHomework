public class Car {
    private static boolean start = false;
    private static int currentSpeed = 0;

    public static void checkStageOfEngine() {
        if (start) {
            System.out.println("Engine is on");
        } else {
            System.out.println("Engine is off");
        }
    }

    public static void startOfTheCar() throws InterruptedException {
        if (start) {
            System.out.println("Engine has already turned on");
        } else {
            System.out.println("You are turning the engine on");
            Thread.sleep(1500);
            Car.start = true;
            checkStageOfEngine();
            System.out.println("You can drive now");
        }
    }

    public static void driveTheCar() throws InterruptedException {
        if (start && currentSpeed == 0) {
            System.out.println("The car is accelerating");
            int allowedSpeed = 60;
            while (currentSpeed != allowedSpeed) {
                Thread.sleep(500);
                int acceleration = 5;
                currentSpeed += acceleration;
                checkSpeed();
            }
        } else {
            System.out.println("You are driving the car with speed: " + currentSpeed);
        }
    }

    public static void turnOffTheEngine() throws InterruptedException {
        if (currentSpeed == 0) {
            System.out.println("You are turning the engine off");
            Thread.sleep(1000);
            start = false;
            System.out.println("The engine has turned off");
        } else {
            System.out.println("You can not turn engine off,\n because car is moving with speed: " + currentSpeed);
            System.out.println("For turning off the engine, car should be stopped");
        }
    }

    public static void reduceTheSpeed() throws InterruptedException {
        if (currentSpeed != 0) {
            checkSpeed();
            System.out.println("Car is going to stop");
            while (currentSpeed != 0) {
                int reducing = -5;
                currentSpeed -= reducing;
                Thread.sleep(1000);
                checkSpeed();
            }
            System.out.println("Car has stopped");
        } else {
            System.out.println("We can not reduce the speed,\n because car is not driving now");
        }
    }

    public static void checkSpeed() {
        System.out.println("Current speed : " + currentSpeed);
    }
}
