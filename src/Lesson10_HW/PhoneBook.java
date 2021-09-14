package Lesson10_HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.*;

public class PhoneBook {

        Map<String, ArrayList<String>> phoneBook = new HashMap<>();
        //List<String> numbers = new ArrayList<>();

        public void add (String surname, String phoneNum) {
                if (phoneBook.containsKey(surname)) {
                        phoneBook.get(surname).add(phoneNum);
                } else {
                        phoneBook.put(surname, new ArrayList<>(Arrays.asList(phoneNum)));
                }
        }

        public List<String> get(String surname) {
                return phoneBook.get(surname);
        }


}
