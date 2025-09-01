package chapter03;

import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        // or int number3 = (int) (System.currentTimeMillis()%10);
        // or int number4 = (int) (System.currentTimeMillis()/ 7 % 10);  (div 7 because millis cast same moment)

        System.out.println(number1 + "+" + number2 + "=?");

        int total = input.nextInt();

        if (number1+number2==total) {
            System.out.println("Correct!!");
        }
         else {
            System.out.println("Wrong!!");
        }
        //System.out.println(number1 + number2 == total);

    }
}
