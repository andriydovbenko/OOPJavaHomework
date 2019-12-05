package com.mytasks.oop;

import com.mytasks.oop.counter.WhichCountInstances;
import com.mytasks.oop.figure.Circle;
import com.mytasks.oop.game.controller.Game;

import java.text.DecimalFormat;

public class OOPTasks {
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

        Game game = new Game();
        game.start();
    }
}

