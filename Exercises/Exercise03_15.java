package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your 3-digit lucky number: ");
        int guess = input.nextInt();

        int winningNumber = (int) (Math.random() * 1000);

        int winFirstDigit = winningNumber % 10;
        int winSecondDigit = (winningNumber / 10) % 10;
        int winThirdDigit = winningNumber / 100;

        int guessFirstDigit = guess % 10;
        int guessSecondDigit = (guess / 10) % 10;
        int guessThirdDigit = guess / 100;

        if (guess == winningNumber) {
            System.out.println("JACKPOT!!! You won $10000!!!");
        } else if ((guessFirstDigit == winFirstDigit || guessFirstDigit == winSecondDigit || guessFirstDigit == winThirdDigit) &&
                (guessSecondDigit == winFirstDigit || guessSecondDigit == winSecondDigit || guessSecondDigit == winThirdDigit) &&
                (guessThirdDigit == winFirstDigit || guessThirdDigit == winSecondDigit || guessThirdDigit == winThirdDigit)) {
            System.out.println("Congrats!! you won $5000");
        } else if ((guessFirstDigit == winFirstDigit || guessFirstDigit == winSecondDigit || guessFirstDigit == winThirdDigit) ||
                (guessSecondDigit == winFirstDigit || guessSecondDigit == winSecondDigit || guessSecondDigit == winThirdDigit) ||
                (guessThirdDigit == winFirstDigit || guessThirdDigit == winSecondDigit || guessThirdDigit == winThirdDigit)) {
            System.out.println("Congrats!! you won $1000");
        } else
            System.out.println("We're sorry, you could not win :(");
    }
}
