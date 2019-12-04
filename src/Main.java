import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static boolean executingGame = true;

    private static void transmitCommand(int command) throws InterruptedException {
        switch (command) {
            case 1: { Car.startTheCar();         break; }
            case 2: { Car.turnOffTheEngine();    break; }
            case 3: { Car.driveTheCar();         break; }
            case 4: { Car.reduceTheSpeed();      break; }
            case 5: { Car.checkSpeed();          break; }
            case 6: { printCommand();            break; }
            case 9: { executingGame = false;     break; }
            default: { System.out.println("You entered non-exist command "); break; }
        }
    }

    private static void printCommand() {
        System.out.println("Available command: ");
        System.out.println("To start the engine of the car:   press 1");
        System.out.println("To stop the engine of the car:    press 2");
        System.out.println("To start driving the car:         press 3");
        System.out.println("To to pull up the car:            press 4");
        System.out.println("To check speed of the car:        press 5");
        System.out.println("To print command                  press 6");
        System.out.println("To exit from game:                press 9\n");
    }

    public static void main(String[] args) {
        double radiusOfCircle = 32;
        Circle circle = new Circle(radiusOfCircle);
        DecimalFormat formatter = new DecimalFormat("#0.00");
        System.out.println("Radius of the circle = " + radiusOfCircle);
        System.out.println("Area of circle = " + formatter.format(circle.getAreaOfCircle()) + "\n");

        new WhichCountInstances();
        new WhichCountInstances();
        new WhichCountInstances();
        System.out.println("Was created: " + WhichCountInstances.getCOUNTER() + " instances of this class\n");

        System.out.println("Game the Car");
        printCommand();
        while (executingGame) {
            Scanner input = new Scanner(System.in);
            try {
                int command = input.nextInt();
                transmitCommand(command);
            } catch (InputMismatchException | InterruptedException e) {
                System.out.println("Input Error, try again");
            }
        }
        System.out.println("End of the Game");
    }
}

