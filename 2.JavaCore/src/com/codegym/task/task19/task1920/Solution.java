package com.codegym.task.task19.task1920;

/* 
The richest

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s = "";
        Map<String, Double> data = new TreeMap<>();

        while ((s = reader.readLine()) != null) {
            String[] strings = s.split(" ");
            String key = strings[0];
            double salary = Double.parseDouble(strings[1]);
            if (data.containsKey(key)) {
                double value = data.get(key);
                data.put(key, value + salary);
            } else {
                data.put(key, salary);
            }
        }
        reader.close();

        double maxSalary = 0;

        for (Map.Entry<String, Double> entry : data.entrySet()) {
            double salary = entry.getValue();
            if (salary > maxSalary) {
                maxSalary = salary;
            }
        }

        for (Map.Entry<String, Double> entry : data.entrySet()) {
            double salary = entry.getValue();
            if (salary == maxSalary) {
                System.out.println(entry.getKey());
            }
        }
    }
}
