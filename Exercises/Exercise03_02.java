package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_02 {
    public static void main(String[] args) {

        int number1 = (int) ((Math.random() * 10));
        int number2 = (int) ((Math.random() * 10));
        int number3 = (int) ((Math.random() * 10));


        System.out.println(number1 + " + " + number2 + " + " + number3 + " = ?");
        int result = number1 + number2 + number3;

        Scanner input = new Scanner(System.in);
        int total = input.nextInt();

        if (total == result) {
            System.out.println("Correct!!!");
        } else
            System.out.println("Wrong!!! \nAnswer: " + result);


    }
}
