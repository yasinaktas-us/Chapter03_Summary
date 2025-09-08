package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();

        System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa:");
        double convertType = input.nextDouble();

        if (convertType == 0) {
            System.out.println("Enter the dollar amount: ");
            double dollarAmount = input.nextDouble();

            double rmbAmount = dollarAmount * exchangeRate;

            System.out.println("$" + dollarAmount + " is " + rmbAmount + " yuan");
        } else {
            System.out.println("Enter the RMB amount:");
            double rmbAmount = input.nextDouble();

            double dollarAmount = rmbAmount / exchangeRate;

            System.out.println(rmbAmount + " yuan is $" + (int)(dollarAmount*100)/100.00);
        }


    }
}
