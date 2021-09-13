package Lesson9_HW;

public class Main {

    public static void main(String[] args) /*throws MyArraySizeException, MyArrayDataException*/ {

        String arr[][] = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"}
        };
        calcSum(arr);
    }

    static void checkSize(String[][] arr) {
           if (arr.length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4х4");
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length !=4) {
                    throw new MyArraySizeException("Размер массива должен быть 4х4");
            }
        }
    }
    static void calcSum (String[][] arr) {
        checkSize(arr);

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Элемент массива с индексом [" + i + "] [" + j + "] имеет не числовой формат", e);
                }
            }
        }
        System.out.println(sum);
    }
}
