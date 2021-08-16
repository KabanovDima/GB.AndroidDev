package Lesson3;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HW_Lesson3 {
    public static void main(String[] args){
        guessWord();
    }

    //task1
    static void guessNum() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(10);
        System.out.println("Вам нужно угадать число. У вас будет три попытки.");
        System.out.println("Введите число от 0 до 9");
        for(int i = 0; i < 3; i++) {
            int userNum = scan.nextInt();
            if (userNum > 9) {
                System.out.println("Вы ввели неверное число. Попробуйде снова");
            } else if(userNum == num) {
                System.out.println("Вы угадали число! Поздравляем!!");
                break;
            } else if (userNum < num) {
                System.out.println("Загаданное число больше");
                i = i++;
            } else {
                System.out.println("Загаданное число меньше");
                i = i++;
            }
        }
        System.out.println();
        System.out.println("Повторить игру еще раз? 1 - да / 0 - нет.");
        int cont = scan.nextInt();
        if (cont == 1) {
            guessNum();
        } else {
            System.out.println("Спасибо за игру. Пока!");
        }

    }

    //task2
    static void guessWord() {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String compWord = words[rand.nextInt(words.length)];
        String userWord;
        System.out.println("Комп загадал: " + compWord);
        System.out.println("Вам нужно угадать загаданное слово из следующих: apple, orange, lemon, banana, apricot, ");
        System.out.println("avocado, broccoli, carrot, cherry, garlic, grape, melon, leak, kiwi, mango, mushroom, nut, ");
        System.out.println( "olive, pea, peanut, pear, pepper, pineapple, pumpkin, potato");
        System.out.println("Введите ваш ответ");

        do {
            userWord = scan.nextLine();
            //System.out.println("Юзер ввел: " + userWord);
            if (userWord.equals(compWord)) {
                break;
            }
            for (int i = 0; i < 15; i++) {
                /**if (userWord.equals(compWord)) {
                    break;
                }*/
                if (i < compWord.length() && i < userWord.length()) {
                    char a = compWord.charAt(i);
                    char b = userWord.charAt(i);
                    if (a == b) {
                        System.out.print(a);
                        continue;
                    }
                }
                System.out.print('#');
            }
            System.out.println();
        } while (!userWord.equals(compWord));
        System.out.println("Вы угудали! Поздравляем!");
        scan.close();
    }


}
