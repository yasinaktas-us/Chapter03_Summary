package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a, b, c : ");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double disc = (b * b) - (4 * a * c);

        double r1 = ((-b) + (Math.pow(disc, 0.5))) / (2 * a);
        double r2 = ((-b) - (Math.pow(disc, 0.5))) / (2 * a);


        if (disc > 0) {
            System.out.println("The equation has two roots: " + (int)(r1*100)/100.000 + " and " + (int)(r2*100)/100.000);
        } else if (disc == 0) {
            System.out.println("The equation has one root: " + (int)(r1*100)/100.000);
        } else if (disc < 0) {
            System.out.println("The equation has no roots!");
        }
    }
}
