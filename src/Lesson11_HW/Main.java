package Lesson11_HW;

import Lesson11_HW.fruit.Apple;
import Lesson11_HW.fruit.Box;
import Lesson11_HW.fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Box<Orange> box1 = new Box<>();
        Box<Apple> box2 = new Box<>();
        box1.compare(box2);
    }

    static void task1() {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(7);
        System.out.println("Изначальный массив: " + linkedList);
        Integer temp = linkedList.get(1);
        Integer temp2 = linkedList.get(2);
        linkedList.set(1, temp2);
        linkedList.set(2, temp);
        System.out.println("Измененный массив: " + linkedList);
    }
    static void doTask2() {
        String[] words = {"ace", "boom", "crew", "dog", "eon"};
        List<String> wordList = Arrays.asList(words);

        for (String e : wordList) {
            System.out.println(e);
        }
    }
    static void doTask2_1() {
        int[] num = {1, 3, 5, 8};
        List<Integer> numList = new ArrayList<Integer>();
        for (int i = 0; i < num.length; i++) {
            numList.add(num[i]);
        }
        System.out.println(numList);
    }
}
