package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> allSalaries = new HashMap<>();
        allSalaries.put("Jolie", 1000);
        allSalaries.put("Reeves", 1200);
        allSalaries.put("Smith", 450);
        allSalaries.put("Malcovich", 300);
        allSalaries.put("Yovovich", 600);
        allSalaries.put("Willis", 750);
        allSalaries.put("Watson", 390);
        allSalaries.put("Stallone", 700);
        allSalaries.put("Roth", 490);
        allSalaries.put("Dallas", 900);
        return allSalaries;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        Iterator iterator = copy.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> pair = (Map.Entry<String, Integer>) iterator.next();
            int salary = pair.getValue();
            String key = pair.getKey();
            if (salary<500) {
                map.remove(key);
            }
        }
    }

    public static void main(String[] args) {
    }
}