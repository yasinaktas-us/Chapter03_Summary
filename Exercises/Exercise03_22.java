package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");
        double axisX = input.nextDouble();
        double axisY = input.nextDouble();

        double radius = 10;

        double point = Math.pow((Math.pow((axisX - 0), 2) + Math.pow((axisY - 0), 2)), 0.5);

        if (point <= 10) {
            System.out.println("Point (" + axisX + ", " + axisY + ") is in the circle.");
        } else
            System.out.println("Point (" + axisX + ", " + axisY + ") is not in the circle.");
    }
}
