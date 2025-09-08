package chapter03.Exercises;

import java.util.Random;
import java.util.Scanner;

public class Exercise03_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your choose: \n"+
                "scissor (0), rock (1), paper (2)");
        int choose= input.nextInt();

        Random random = new Random();
        int computer = random.nextInt(2);

        switch (computer){
            case 0: System.out.print("The computer is scissor. ");break;
            case 1: System.out.print("The computer is rock. ");break;
            case 2: System.out.print("The computer is paper. ");break;
        }
        switch (choose){
            case 0: System.out.print("You are scissor ");break;
            case 1: System.out.print("You are rock ");break;
            case 2: System.out.print("You are paper ");break;
        }
        if(computer==0){
            if (choose==0)
                System.out.println("too. It is a draw.");
            else if (choose==1) {
                System.out.println("You won.");
            }else
                System.out.println("you lose.");
        } else if (computer==1) {
            if (choose==0)
                System.out.println("You lose.");
            else if (choose==1)
                System.out.println("too. It is a draw.");
            else
                System.out.println("You win.");
        } else {
            if(choose==0)
                System.out.println("You win.");
            else if (choose==1)
                System.out.println("You lose.");
            else
                System.out.println("too. It is a draw.");

        }
    }
}
