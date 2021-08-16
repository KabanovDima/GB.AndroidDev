package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {

    public static void main(String[] args) {
        doRandomWithRandDemo();
    }

    static void createArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input array size: ");
        int size = scanner.nextInt();

        int[] digits = new int[size];

        for (int i = 0; i < digits.length; i++) {
            System.out.println("Please input value ...");
            digits[i] = scanner.nextInt();
        }
        printArray(digits);
    }

    static void doScannerDemo2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the age...");
        int age = scanner.nextInt();
        String ageMessage = "Your age is " + age + "!";
        System.out.println(ageMessage);
    }

    static void doScannerDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name...");
        String name = scanner.nextLine();
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);
    }

    static void doRandomWithRangeDemo(int min, int max) {
        Random rand = new Random();

        int[] digits = new int[10];

        for(int i = 0; i < digits.length; i++) {
            digits[i] = rand.nextInt(max - min) + min;
        }

        printArray(digits);
    }

    static void shuffeArray() {
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = new Random();

        for (int i = 0; i < digits.length; i++) {
            int randIndex = random.nextInt(digits.length);
            int temp = digits[i];
            digits[i] = digits[randIndex];
            digits[randIndex] = temp;
        }
        printArray(digits);
    }

    static void doRandomWithRangeDemoOne(int min, int max) {
        Random rand = new Random();

        int[] digits = new int[10];

        for(int i = 0; i < digits.length; i++) {
            digits[i] = rand.nextInt(max) * (max - min);
        }

        printArray(digits);
    }

    static void doRandomWithRandDemo() {
        Random rand = new Random();

        int[] digits = new int[10];

        for(int i = 0; i < digits.length; i++) {
            digits[i] = rand.nextInt(digits.length);
        }

        printArray(digits);
    }

    static void doRandomDemo() {
        Random rand = new Random();

        int[] digits = new int[100];

        for(int i = 0; i < digits.length; i++) {
            digits[i] = rand.nextInt();
        }

        printArray(digits);
    }

    static void printArray(int[] values) {
        for(int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

}
