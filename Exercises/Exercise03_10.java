package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 100);
        int number2 = (int) (Math.random() * 100);


        System.out.println(number1 + " + " + number2 + " = ?");

        int total = input.nextInt();

        int result = number1 + number2;

        if (number1 + number2 == total) {
            System.out.println("Correct!!");
        } else {
            System.out.println("Wrong!!");
            System.out.println(number1 + " + " + number2 + " = " + result);
        }

    }
}
