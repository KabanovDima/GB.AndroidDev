package Lesson2;

import java.util.Arrays;

public class Lesson2 {

    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 1};
        System.out.println(task6(arr));
    }

    // Home Work

    static void task1 () {
        System.out.println("Start");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Size: " +arr.length);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
           }
        System.out.println("End");
    }

    static void task2 () {
        int[] arr = new int[8];
        for(int i = 0; i < arr.length; i++) {
                arr[i] = i * 3;
            System.out.println(arr[i]);
            }
    }

    static void task3 () {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println(arr[i]);
        }
    }

    static void task4 () {
        int[][] matrix = new int[3][3];
        for(int i=0; i < matrix.length; i++ )
            matrix[i][matrix.length-1 - i] = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i] == matrix[j]) {
                    matrix[i][j] = 1;
                }
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void  task5 () {
        int[] arr = {1, 4, 3, -10, 42};
        int min = arr[0];
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
            }
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }

    static boolean task6 (int[] arr) {
        /* вставить в метод для проверки:
        int[] arr = {1, 0, 1, 1};
        System.out.println(task6(arr));
         */
        int leftSumm = 0;
        int rightSumm;

        for (int i = 0; i < arr.length; i++) {
            leftSumm += arr[i];
            rightSumm = 0;

            for (int j = i + 1; j < arr.length; j++) {
                rightSumm += arr[j];
            }
            if (leftSumm == rightSumm) {
                return true;
            }
        }
        return false;
    }





    //____LESSON 2____

    //Array__________

    //Двумерный массив

    static void print2DAraay(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
               System.out.print(matrix[i][j]);
               System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void do2DArrayDemo2 () {
        int[][] matrix = new int[3][];
        matrix[0] = new int[] {1, 2, 3};
        matrix[1] = new int[] {4, 5, 6};
        matrix[2] = new int[] {7, 8};
    }

    static int[][] do2DArrayDemo () {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5},
                {7, 8, 9},
        };
        return matrix;
    }

    static void doArrayDemo2 () {
        int[] arr = {23, -1, 67, 122, 0, 8, 1};
        printArray(arr);
    }

    // Array.lenght
    /*
    Скопировать для вывода: "int[] arr = {23, -1, 67, 122, 0, 8, 1};
        printArray(arr);"
     */
    static void printArray(int[] array) {
        System.out.println("Size: " + array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    static void doOutOfBoundArrayError () { //на момент создания массива значения массива уже известны
        int[] arr = {23, -1, 67, 122, 0, 8};
        for (int i = 0; i < 7; i++) {
            System.out.println(arr[i]);
        }
    }

    static void doArrayDemo () { //stack start. Создаем данный массив, когда мы не знаем его значений (создали массив, выдеили память и после этого будем присваивать значения
        int[] arr = new int[3];
        arr[0] = 23;
        arr[1] = -1;
        arr[2] = 67;

        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }
    } //stack end

    //Array Index Error (-1)

    // Индекс - номер квартиры
    static void doArrayIndexErrorDemo () { //stack start
        int[] arr = new int[3];
        arr[0] = 23;
        arr[1] = -1;
        arr[2] = 67;
        arr[-1] = 67;
    } //stack end

    //Циклы______________

    //Continue
    static void doContinueDemo () {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    //Break
    static void doBreakDemo () {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 3) {
                break;
            }
        }
    }

    //Parametized (0 - N)
    static void doForLoopDemo() {
        System.out.println("doForLoopDemo Start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("doForLoopDemo End");
    }

    //Post-cond (1 - N)
    static void doDoWhileLoopDemo() {
        System.out.println("DoWhileLoopStart");
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < 10);
        System.out.println("DoWhileLoopEnd");
    }

    //Pre-cond (0 - N)
    static void doWhileLoopDemo() {
        System.out.println("WhileLoopStart");
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("WhileLoopEnd");
    }

}