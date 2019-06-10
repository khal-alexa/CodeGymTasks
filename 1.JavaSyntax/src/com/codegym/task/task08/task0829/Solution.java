package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> families = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            families.put(city, family);

        }

        String targetFamily = reader.readLine();

        for (Map.Entry<String, String> pair : families.entrySet()) {
            if (pair.getKey().equals(targetFamily)) {
                System.out.println(pair.getValue());
            }
        }
    }
}
