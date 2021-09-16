package Lesson10_HW;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }
    static void task1() {

        String[] array = {"Max", "Max", "Apple", "Nick", "Berta", "Berta", "Window", "Cat", "Dog", "Windows", "Max"};
        System.out.println("Изначальный массив: ");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        /*for (String word : array) {
            System.out.print(word + ", ");
        }*/
        System.out.println();
        System.out.println();

        Set<String> uniqueWords = new LinkedHashSet<>();
        System.out.println("Уникальный массив: ");
        for (int i = 0; i < array.length; i++) {
            uniqueWords.add(array[i]);
        }
        System.out.println(uniqueWords);
        System.out.println();
        /*for (String word : uniqueWords) {
            System.out.println(word);
        }*/

        /*int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[i].equals(array[j])) {
                    count++;
                    //System.out.println(array[i] + ":" + count);
            }
            }
            System.out.println(array[i] + ":" + count);

        }*/

        HashMap<String, Integer> countWords = new HashMap<>();
        for (String item : uniqueWords) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                if (item.equals(array[i])){
                    sum++;
                }
                countWords.put(item, sum);
            }
        }
        for (Map.Entry<String, Integer> o : countWords.entrySet()) {
            System.out.println(o.getKey() + " указано в количестве " + o.getValue());
        }
        System.out.println();
        /*Map<String, Integer> countWords = new HashMap<>();
        for (String words : uniqueWords) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if(array.equals(uniqueWords)) {
                    sum++;
                }
                countWords.put(array[i], sum);
            }

        }*/

    }

    static void task2() {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Ivanov", "+7 912 20 20");
        phoneBook.add("Ivanov", "+7 912 20 21");
        phoneBook.add("Petrov", "+7 912 20 30");
        phoneBook.add("Kabanov", "+7 912 03 68");


        System.out.println("Ivanov: " + phoneBook.get("Ivanov"));
        System.out.println("Kabanov: " + phoneBook.get("Kabanov"));

    }

}
