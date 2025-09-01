package chapter03;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class SubsractionQuiz {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        if (number1 < number2){
            int temp=number1;
            number1=number2;
            number2=temp;       //Swap algori9thms
        }


        System.out.println(number1 + " - " + number2 + " =?");

        Scanner input = new Scanner(System.in);
        int result = input.nextInt();

        if (number1-number2==result){
            System.out.println("Correct!!");
        } else {
            System.out.println("Wrong!!  True answer: "+(number1-number2));
        }
    }
}
