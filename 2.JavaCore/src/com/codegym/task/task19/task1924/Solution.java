package com.codegym.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Replacing numbers

*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        map.put(11, "eleven");
        map.put(12, "twelve");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String s = "";

        while ((s = fileReader.readLine()) != null) {
            String[] strings = s.split(" ");
            s = "";
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].matches("\\d+")) {
                    int key = Integer.parseInt(strings[i]);
                    if (key > -1 && key < 13) {
                        strings[i] = map.get(key);
                    }

                } else if (strings[i].matches("\\d+[\\.\\,]+")) {
                    char punctuation = strings[i].charAt(strings[i].length() - 1);
                    String digit = strings[i].substring(0, strings[i].length() - 1);
                    int key = Integer.parseInt(digit);
                    if (key > -1 && key < 13) {
                        strings[i] = map.get(key) + punctuation;
                    }
                }
                s = s + strings[i] + " ";
            }
            System.out.println(s.trim());
        }
        reader.close();
        fileReader.close();
    }
}

