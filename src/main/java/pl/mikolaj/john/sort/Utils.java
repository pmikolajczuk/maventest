package pl.mikolaj.john.sort;

import java.util.Random;

public class Utils {
    public static int[] generateArray(int size) {
        Random rand = new Random();
        int[] numbers = new int[size];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        return numbers;
    }

    public static void printArray(int[] numbers) {
        for(int number : numbers){
            System.out.print(number + ", ");
        }
        System.out.println();
    }
}
