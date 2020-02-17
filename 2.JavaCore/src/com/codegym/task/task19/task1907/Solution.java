package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String s = "";
        List<String> words = new ArrayList<>();

        while ((s = fileReader.readLine()) != null) {
            String[] strings = s.split("\\W");
            for (int i = 0; i < strings.length; i++) {
                words.add(strings[i]);
            }
        }
        fileReader.close();

        int counter = 0;
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equalsIgnoreCase("world")) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}
