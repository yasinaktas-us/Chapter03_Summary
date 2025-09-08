package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        double x4 = input.nextDouble();
        double y4 = input.nextDouble();


        double equation1_X = ((x3 * y2) - (y1 * y3)) / ((x1 * y2) - (y1 * x2));
        double equation1_Y = ((x1 * y3) - (x3 * x2)) / ((x1 * y2) - (y1 * x2));

        double equation2_X = ((x4 * y2) - (y1 * y4)) / ((x1 * y2) - (y1 * x2));
        double equation2_Y = ((x1 * y4) - (x4 * x2)) / ((x1 * y2) - (y1 * x2));

        System.out.println(equation1_X + " " + equation1_Y);
        System.out.println(equation2_X + " " + equation2_Y);

    }
}
