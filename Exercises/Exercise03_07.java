package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_07 {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Receive the amount
        System.out.print(
                "Enter an amount in double, for example 33.50: ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Find the number of one dollar
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Find the number of quarters in the remaining amount
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Find the number of dimes in the remaining amount
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Find the number of nickels in the remaining amount
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Find the number of pennies in the remaining amount
        int numberOfPennies = remainingAmount;

        // Display results
        System.out.println("Your amount " + amount + " consists of");

        System.out.print("    " + numberOfOneDollars);
        if (numberOfOneDollars == 1 || numberOfOneDollars == 0)
            System.out.println(" dollar");
        else
            System.out.println(" dollar");

        System.out.print("    " + numberOfQuarters);
        if (numberOfQuarters == 1 || numberOfQuarters == 0)
            System.out.println(" quarter");
        else
            System.out.println(" quarters");

        System.out.print("    " + numberOfDimes);
        if (numberOfDimes == 1 || numberOfDimes == 0)
            System.out.println(" dime");
        else
            System.out.println(" dimes");

        System.out.println("    " + numberOfNickels);
        if (numberOfNickels == 1 || numberOfNickels == 0)
            System.out.println(" nickel");
        else
            System.out.println(" nickels");

        System.out.println("    " + numberOfPennies);
        if (numberOfPennies == 1 || numberOfPennies == 0)
            System.out.println(" penny");
        else
            System.out.println(" pennies");
    }
}

