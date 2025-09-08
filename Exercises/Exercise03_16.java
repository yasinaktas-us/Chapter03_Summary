package chapter03.Exercises;

import java.util.Random;

public class Exercise03_16 {
    public static void main(String[] args) {
        Random random = new Random();

        int width = random.nextInt(100);
        int height = random.nextInt(200);

        System.out.println("The rectangle's coordinates are " + "(" + width + ", " + height + ")");

    }
}
