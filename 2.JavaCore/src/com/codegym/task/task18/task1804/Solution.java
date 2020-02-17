package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        Map<Integer, Integer> map = new HashMap<>();
        int minFrequency = 10;

        while ((inputStream.available()) > 0) {
            int element = inputStream.read();
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            }
            else {
                map.put(element, 1);
            }
            if (map.get(element) < minFrequency) {
                minFrequency = map.get(element);
            }
        }

        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if (entry.getValue() == minFrequency) {
                System.out.print(entry.getKey() + " ");
            }
        }
        inputStream.close();
        }
    }
