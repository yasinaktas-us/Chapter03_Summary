package chapter03;

import java.util.Scanner;

public class ComputingTaxes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the filling status: \n" +
                "0- Single \n" +
                "1- Married \n" +
                "2- Married Separately \n" +
                "3- Head of Household ");

        int status = input.nextInt();

        System.out.println("Enter the income amount: ");
        double income = input.nextDouble();

        double tax;

        // Compute Tax only for singles

        if (status == 0) {
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = (income * 0.10) + (income - 8350) * 0.15;
            } else if (income <= 82250) {
                tax = (income * 0.10) + (income - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 171550) {
                tax = (income * 0.10) + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 82250) * 0.28;
            } else if (income <= 372950) {
                tax = (income * 0.10) + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 82250) * 0.28 + (income - 171550) * 0.33;
            } else {
                tax = (income * 0.10) + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 82250) * 0.28 + (income - 171550) * 0.33 + (income - 372950) * 0.35;
            }
       /* } else if (status==1) {

        } else if (status==2) {

        } else if (status==3) {

        } else
            System.out.println("Error: Invalid Status");
        */
            System.out.println("Tax is $ " + (tax * 100) / 100.0);
        }
    }
}
