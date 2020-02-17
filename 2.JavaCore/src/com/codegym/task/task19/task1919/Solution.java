package com.codegym.task.task19.task1919;

/* 
Calculating salaries

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        Map<String, Double> data = new HashMap<>();

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s = "";

        while ((s = reader.readLine()) != null) {
            String[] strings = s.split(" ");
            String lastName = strings[0];
            double salary = Double.parseDouble(strings[1]);
            if (data.containsKey(lastName)) {
                double value = data.get(lastName);
                data.put(lastName, value + salary);
            } else {
                data.put(lastName, salary);
            }
        }
        reader.close();

        Map<String, Double> sortedData = new TreeMap<>(data);
        for (Map.Entry<String, Double> entry : sortedData.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
