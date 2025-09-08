package chapter03.Exercises;

import java.util.Random;

public class Exercise03_24 {
    public static void main(String[] args) {

        System.out.print("The card you picked ");

        Random random = new Random();

        int rank = random.nextInt(13);

        if (rank == 1) {
            System.out.print("Ace");
        } else if (rank == 11) {
            System.out.print("Jack");
        } else if (rank == 12) {
            System.out.print("Queen");
        } else if (rank == 13) {
            System.out.print("King");
        } else
            System.out.print(rank);

        System.out.print(" of ");

        int suit = random.nextInt(4);

        if (suit == 1) {
            System.out.print("Clubs");
        } else if (suit == 2) {
            System.out.print("Diamonds");
        } else if (suit == 3) {
            System.out.print("Hearts");
        } else if (suit == 4) {
            System.out.print("Spades");
        }

    }
}
