package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        Map<String, String> people = new HashMap<>();
        people.put("Reeves", "Keanu");
        people.put("Yovovich", "Mila");
        people.put("Cunis", "Mila");
        people.put("Smith", "Will");
        people.put("Smith", "Jada");
        people.put("Malcovich", "John");
        people.put("Farrel", "Colin");
        people.put("Willis", "Bruce");
        people.put("Messy", "John");
        people.put("Jolie", "Angelina");

        return people;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
