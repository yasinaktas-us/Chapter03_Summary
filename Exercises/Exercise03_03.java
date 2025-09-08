package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, f : ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();

        double x = ((e * d) - (b * f)) / ((a * d) - (b * c));
        double y = ((a * f) - (e * c)) / ((a * d) - (b * c));

        if ((a * d) - (b * c) == 0) {
            System.out.println("The equation has no solution!!");
        } else {
            System.out.println("Value X: " + (int) (x * 100) / 100.0);
            System.out.println("Value Y: " + (int) (y * 100) / 100.0);
        }
    }
}
