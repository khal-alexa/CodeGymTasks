package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.security.spec.ECField;
import java.util.ArrayList;
import java.util.List;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        List<String> strings = new ArrayList<>();

        while (!s.equals("exit")) {
            s = reader.readLine();
            strings.add(s);
        }

        for (int i = 0; i < strings.size() - 1; i++) {
            String string = strings.get(i);
            if (string.contains(".") && isDouble(string)) {
                Double number = Double.parseDouble(string);
                print(number);
            }
            else if (isNumber(string)) {
                int number = Integer.parseInt(string);
                if (number > 0 && number < 128) {
                    short shortNumber = (short) number;
                    print(shortNumber);
                } else if (number <= 0 || number >= 128) {
                    print(number);
                }
            } else {
                print(string);
            }
        }
    }

    public static boolean isNumber(String s) {
        boolean isANumber = false;
        try {
            int number = Integer.parseInt(s);
            isANumber = true;
        } catch (Exception e) {
        }
        return isANumber;
    }

    public static boolean isDouble(String s) {
        boolean isADouble = false;
        try {
            Double number = Double.parseDouble(s);
            isADouble = true;
        } catch (Exception e) {
        }
        return isADouble;
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}
