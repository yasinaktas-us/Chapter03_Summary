package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the time zone offset to GMT ");
        int timeZone = input.nextInt();

        long totalMillisSecond = System.currentTimeMillis();

        long totalSecond = totalMillisSecond / 1000;
        long currentSecond = totalSecond % 60;

        long totalMinutes = totalSecond / 60;
        long currentMinutes = totalMinutes % 60;

        long totalHours = totalMinutes / 60;
        long currentHours = totalHours % 12;

        String _12HourClock ;
        if (totalHours%2==0)
            _12HourClock="AM";
        else
            _12HourClock="PM";

        System.out.println("The current time is " + (currentHours-timeZone)+" : "+currentMinutes+" : "+currentSecond+" "+_12HourClock);
    }
}
