package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/


import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        Map<Integer, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < 127; i++) {
            charFrequency.put(i, 0);
        }

        while ((fileInputStream.available()) > 0) {
            int element = fileInputStream.read();
            if (charFrequency.containsKey(element)) {
                int value = charFrequency.get(element);
                charFrequency.put(element, value + 1);
            }
        }
        fileInputStream.close();

        Map<Integer, Integer> sortedMap = new TreeMap<>(charFrequency);
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int key = entry.getKey();
            char symbol = (char) key;
            if (entry.getValue() != 0) {
                System.out.println(symbol + " " + entry.getValue());
            }
        }
    }
}