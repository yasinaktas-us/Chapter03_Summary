package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_04 {
    public static void main(String[] args) {

        int monthNumber = (int) (Math.random() * 10);

        switch (monthNumber){
            case 1: System.out.println(monthNumber+" - January");break;
            case 2: System.out.println(monthNumber+" - February");break;
            case 3: System.out.println(monthNumber+" - March");break;
            case 4: System.out.println(monthNumber+" - April");break;
            case 5: System.out.println(monthNumber+" - May");break;
            case 6: System.out.println(monthNumber+" - June");break;
            case 7: System.out.println(monthNumber+" - July");break;
            case 8: System.out.println(monthNumber+" - August");break;
            case 9: System.out.println(monthNumber+" - September");break;
            case 10: System.out.println(monthNumber+" - October");break;
            case 11: System.out.println(monthNumber+" - November");break;
            case 12: System.out.println(monthNumber+" - December");break;
        }

    }
}
