package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> names = new HashMap<>();
        names.put("Ivanov", "Vasily");
        names.put("Malcovich", "John");
        names.put("Keanu", "Reeves");
        names.put("Bonjovy", "John");
        names.put("Yovovich", "Mila");
        names.put("Kunis", "Mila");
        names.put("Cutcher", "Ashton");
        names.put("Stallone", "Sylvester");
        names.put("Jolie", "Angelina");
        names.put("Pitt", "Brad");
        return names;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int sameFirstNameCounter = 0;
        for (String s: map.values()) {
            if (name.matches(s)) {
                sameFirstNameCounter++;
            }
        }
        return sameFirstNameCounter;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int sameLastNameCounter = 0;
        for (String s: map.keySet()) {
            if (lastName.matches(s)) {
                sameLastNameCounter++;
            }
        }
        return sameLastNameCounter;
    }

    public static void main(String[] args) {
    }
}
