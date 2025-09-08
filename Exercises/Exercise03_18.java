package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight of the package: ");

        int weight = input.nextInt();

        if (0 < weight && weight <= 1) {
            System.out.println("The cost of shipping $3.5");
        } else if (1 < weight && weight <= 3) {
            System.out.println("The cost of shipping $5.5");
        } else if (3 < weight && weight <= 10) {
            System.out.println("The cost of shipping $8.5");
        } else if (10 < weight && weight <= 20) {
            System.out.println("The cost of shipping $10.5");
        } else if (weight > 20) {
            System.out.println("The package cannot be shipped");
        }
    }
}
