package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_33 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter weight and price for package 1: ");
        double weight1=input.nextDouble();
        double price1=input.nextDouble();

        double cost1=price1/weight1;

        System.out.println("Enter weight and price for package 2: ");
        double weight2=input.nextDouble();
        double price2=input.nextDouble();

        double cost2=price2/weight2;

        if (cost1<cost2){
            System.out.println("Package 1 has a better price!");
        } else if (cost1==cost2) {
            System.out.println("Two package have the same price");
        } else
            System.out.println("Package 2 has a better price!");
    }
}
