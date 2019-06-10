package com.codegym.task.task08.task0817;

import java.util.*;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> map = new HashMap<>();
        map.put("Jolie", "Angelina");
        map.put("Yovovich", "Mila");
        map.put("Reeves", "Keanu");
        map.put("Pitt", "Brat");
        map.put("Farell", "Colin");
        map.put("Cunis", "Mila");
        map.put("Willis", "Bruce");
        map.put("Lee", "Bruce");
        map.put("Malcovich", "John");
        map.put("Sutherland", "Keefer");
        return map;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        Set<String> setOfUniqueValues = new HashSet<>(map.values());
        ArrayList<String> uniqueFirstNames = new ArrayList<>(setOfUniqueValues);
        ArrayList<String> allFirstNames = new ArrayList<>(map.values());
        ArrayList<String> peopleToRemove = new ArrayList<>();
        int duplicateCounter = 0;
        for (int i = 0; i < uniqueFirstNames.size(); i++) {
            for (int j = 0; j < allFirstNames.size(); j++) {
                if (uniqueFirstNames.get(i).equals(allFirstNames.get(j))) {
                    duplicateCounter++;
                    if (duplicateCounter == 2) {
                        peopleToRemove.add(allFirstNames.get(j));
                    }
                }
            }
            duplicateCounter = 0;
        }

        for (int i = 0; i < peopleToRemove.size(); i++) {
            String s = peopleToRemove.get(i);
            HashMap<String, String> copy1 = new HashMap<String, String>(map);

            Iterator<Map.Entry<String, String>> iterator2 = copy1.entrySet().iterator();
            while (iterator2.hasNext()) {
                Map.Entry<String, String> pair = iterator2.next();
                String value = pair.getValue();
                if (s.equals(value)) {
                    removeItemFromMapByValue(map, s);
                }
            }
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
    }
}
