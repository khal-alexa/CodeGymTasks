package com.codegym.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream inputStream = new FileInputStream(fileName);
        Set<Integer> uniqueBytes = new HashSet<>();

        while ((inputStream.available()) > 0) {
            int data = inputStream.read();
            uniqueBytes.add(data);
        }

        List<Integer> sortedBytes = new ArrayList<>(uniqueBytes);
        Collections.sort(sortedBytes);
        for (Integer number: sortedBytes) {
            System.out.print(number + " ");
        }

        inputStream.close();
        reader.close();
    }
}
