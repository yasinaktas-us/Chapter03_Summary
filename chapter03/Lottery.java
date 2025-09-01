package chapter03;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        int winningNumber = (int) (Math.random() * 90) + 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lucky number (two digits): ");
        int guess = input.nextInt();

        int winDigit1 = winningNumber % 10;
        int winDigit2 = winningNumber / 10;

        int guessDigit1 = guess % 10;
        int guessDigit2 = guess / 10;


        if (guess == winningNumber) {
            System.out.println("JACKPOT!!! You win $10000!!!");

        } else if ((winDigit1==guessDigit2)&&(winDigit2==guessDigit1)) {
            System.out.println("Congrats!! You win $3000!!");

        } else if ((winDigit1==guessDigit1)||
                    (winDigit1==guessDigit2)||
                    (winDigit2==guessDigit1)||
                    (winDigit2==guessDigit2)) {
            System.out.println("Congrats!! You win $1000!!");

        } else
            System.out.println("Sorry :((");
    }
}
