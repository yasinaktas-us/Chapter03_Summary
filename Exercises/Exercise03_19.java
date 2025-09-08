package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_19 {
    public static void main(String[] args) {
        System.out.println("Enter three edges for a triangle");
        Scanner input = new Scanner(System.in);

        double edgeA = input.nextDouble();
        double edgeB = input.nextDouble();
        double edgeC = input.nextDouble();

        double angle = edgeA + edgeB + edgeC;

        if (edgeA + edgeB > edgeC && edgeB + edgeC > edgeA && edgeA + edgeC > edgeB) {
            System.out.println("The angle of triangle is " + angle);
        } else
            System.out.println("Invalid parameters");
    }
}
