package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a month (1-12): ");
        int month = input.nextInt(12);

        System.out.println("Enter a year: ");
        int year = input.nextInt();


        switch (month){
            case 1: System.out.print("January");break;
            case 2: System.out.print("February");break;
            case 3: System.out.print("March");break;
            case 4: System.out.print("April");break;
            case 5: System.out.print("May");break;
            case 6: System.out.print("June");break;
            case 7: System.out.print("July");break;
            case 8: System.out.print("August");break;
            case 9: System.out.print("September");break;
            case 10: System.out.print("October");break;
            case 11: System.out.print("November");break;
            case 12: System.out.print("December");break;
        }

        System.out.print(" "+year+ " had ");


        if (month == 1 || month == 3 || month == 5 || month == 7 || month==8 || month==10 || month==12) {
            System.out.print(31);
        } else if (month==2) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.print(29);
            } else
                System.out.print(28);
        }
        else
            System.out.print(30);

        System.out.println(" days");
    }
}
