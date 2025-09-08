package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_13 {
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

        double tax = 0;

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
        } else if (status==1) {
            if (income <= 16700) {
                tax = income * 0.10;
            } else if (income <= 67900) {
                tax = (income * 0.10) + (income - 16700) * 0.15;
            } else if (income <= 137050) {
                tax = (income * 0.10) + (income - 16700) * 0.15 + (income - 67900) * 0.25;
            } else if (income <= 208850) {
                tax = (income * 0.10) + (income - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28;
            } else if (income <= 372950) {
                tax = (income * 0.10) + (income - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28 + (income - 208850) * 0.33;
            } else {
                tax = (income * 0.10) + (income - 16700) * 0.15 + (income - 67900) * 0.25 + (income - 137050) * 0.28 + (income - 208850) * 0.33 + (income - 372950) * 0.35;
            }
        } else if (status==2) {
            if (income <= 8350) {
                tax = income * 0.10;
            } else if (income <= 33950) {
                tax = (income * 0.10) + (income - 8350) * 0.15;
            } else if (income <= 68525) {
                tax = (income * 0.10) + (income - 8350) * 0.15 + (income - 33950) * 0.25;
            } else if (income <= 104425) {
                tax = (income * 0.10) + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 137050) * 0.28;
            } else if (income <= 186475) {
                tax = (income * 0.10) + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 137050) * 0.28 + (income - 104425) * 0.33;
            } else {
                tax = (income * 0.10) + (income - 8350) * 0.15 + (income - 33950) * 0.25 + (income - 137050) * 0.28 + (income - 104425) * 0.33 + (income - 186475) * 0.35;
            }
        } else if (status==3) {
            if (income <= 11950) {
                tax = income * 0.10;
            } else if (income <= 45500) {
                tax = (income * 0.10) + (income - 11950) * 0.15;
            } else if (income <= 117450) {
                tax = (income * 0.10) + (income - 11950) * 0.15 + (income - 45500) * 0.25;
            } else if (income <= 190200) {
                tax = (income * 0.10) + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28;
            } else if (income <= 372950) {
                tax = (income * 0.10) + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28 + (income - 190200) * 0.33;
            } else {
                tax = (income * 0.10) + (income - 11950) * 0.15 + (income - 45500) * 0.25 + (income - 117450) * 0.28 + (income - 190200) * 0.33 + (income - 372950) * 0.35;
            }
        } else
            System.out.println("Error: Invalid Status");
        
            System.out.println("Tax is $ " + (int)(tax * 100) / 100.0);
        }
    }
    

