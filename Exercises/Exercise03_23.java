package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point with two coordinates: ");

        double axisX = input.nextInt();
        double axisY = input.nextInt();

        double width = 10;
        double height = 5;


        if (axisX<=10/2 && axisY<=5/2) {
            System.out.println("Point ("+axisX+", "+axisY+") is in the rectangle.");
        } else
            System.out.println("Point ("+axisX+", "+axisY+") is not in the rectangle.");
    }
}
