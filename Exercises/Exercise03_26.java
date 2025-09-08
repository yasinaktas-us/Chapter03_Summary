package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int number = input.nextInt();

        boolean isAndDivisible = (number % 5 == 0 && number % 6 == 0);
        boolean isOrDivisible = (number % 5 == 0 || number % 6 == 0);
        boolean isNotBothDivisible = (number % 5 == 0 ^ number % 6 == 0);

        System.out.println("Is " + number + " divisible by 5 and 6 ? : "+isAndDivisible);
        System.out.println("Is " + number + " divisible by 5 or 6 ? : "+isOrDivisible);
        System.out.println("Is " + number + " divisible by 5 or 6, but not both ? : "+isNotBothDivisible);

    }
}
