package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three different numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        if (number1 < number2 && number1 < number3) {
            if (number2 < number3) {
                System.out.println("Sort to increase: " + number1 + " < " + number2 + " < " + number3);
            } else
                System.out.println("Sort to increase: " + number1 + " < " + number3 + " < " + number2);
        }
        if (number2 < number1 && number2 < number3) {
            if (number1 < number3) {
                System.out.println("Sort to increase: " + number2 + " < " + number1 + " < " + number3);
            } else
                System.out.println("Sort to increase: " + number2 + " < " + number3 + " < " + number1);
        }
        if (number3 < number1 && number3 < number2) {
            if (number1 < number2) {
                System.out.println("Sort to increase: " + number3 + " < " + number1 + " < " + number2);
            } else
                System.out.println("Sort to increase: " + number3 + " < " + number2 + " < " + number1);
        }
    }
}
