package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a point`s x- and y- coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();

        double pointA_X = 0;
        double pointA_Y = 100;
        double pointB_X = 200;
        double pointB_Y = 0;

        double point = (pointA_X - x) * (pointB_Y - y) - (pointB_X - x) * (pointA_Y - y);

        if (0 < x && x > pointA_X && x < pointB_X && 0 < y && y < pointA_Y && y > pointB_Y && point<0) {
            System.out.println("The point is in the triangle.");
        }else
            System.out.println("The point is not in the triangle.");
    }
}
