package Lesson12_HW;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        firstMethod();
        secondMethod();
    }

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;


    public static void firstMethod() {
        float[] arr = new float[SIZE];
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long b = System.currentTimeMillis() - a;
        System.out.println("First method last an: " + b);
    }

    public static void secondMethod() {
        float[] arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        long a = System.currentTimeMillis();

        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];


        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);

        Thread t1 = new Thread();
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        Thread t2 = new Thread();
        for (int i = 0; i < arr2.length; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);

        long b = System.currentTimeMillis() - a;

        System.out.println("Second method last an: " + b);
    }
}
