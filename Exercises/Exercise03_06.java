package chapter03.Exercises;

import java.util.Scanner;

public class Exercise03_06 {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double pound=input.nextDouble();

        System.out.println("Enter feet: ");
        double feet=input.nextDouble();

        System.out.println("Enter inches: ");
        double inch=input.nextDouble();

        final double KILOGRAMS_PER_POUND=0.453;
        final double METERS_PER_FOOT=0.3048;
        final double METERS_PER_INCH=0.0254;

        double weight=pound*KILOGRAMS_PER_POUND;
        double height=(inch*METERS_PER_INCH)+(feet*METERS_PER_FOOT);

        double bmi=weight/(height*height);

        System.out.println("BMI: "+bmi);

        if(bmi < 18.5){
            System.out.println("UnderWeight");
        } else if (bmi <25) {
            System.out.println("Normal");
        } else if (bmi <30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

    }

