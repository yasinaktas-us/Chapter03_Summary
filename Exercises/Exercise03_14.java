package chapter03.Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise03_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Your guess (0-head or 1-tail): ");
        int guess = input.nextInt();

        Random random = new Random();
        int coin = random.nextInt(2);

        if (guess==coin)
            System.out.println("Win!!");
        else
            System.out.println("Lose!!");



    }
}
