package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter year (e.g. 2000)");
        int year = input.nextInt();

        System.out.println("Enter month (1-12)");
        int month = input.nextInt();

        if (month == 1 || month == 2){
            month = month + 12;
            year = year - 1;
        }

        System.out.println("Enter the day of the month (1-31): ");
        int day = input.nextInt();

        int yearOfCentury = year % 100;
        int theCentury = year / 100;


        int dayOfTheWeek = (day + ((26 * (month + 1)) / 10) + yearOfCentury + (yearOfCentury / 4) + (theCentury / 4) + (5 * theCentury)) % 7;

        System.out.print("Day of the week is ");
        switch (dayOfTheWeek){

            case 0: System.out.println("Saturday"); break;
            case 1: System.out.println("Sunday"); break;
            case 2: System.out.println("Monday"); break;
            case 3: System.out.println("Tuesday"); break;
            case 4: System.out.println("Wednesday"); break;
            case 5: System.out.println("Thursday"); break;
            case 6: System.out.println("Friday"); break;
        }
    }
}
