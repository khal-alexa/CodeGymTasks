package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException, ArithmeticException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String URL = reader.readLine();

        String[] parts = URL.split("\\?|\\&");
        List<String> parameters = new ArrayList<>();
        String objValue = null;

        for (int i = 1; i < parts.length; i++) {
            parameters.add(parts[i]);
        }

        for (int i = 0; i < parameters.size(); i++) {
            String[] strings = parameters.get(i).split("=");
            System.out.print(strings[0] + " ");
            if (strings[0].equals("obj")) {
                objValue = strings[1];
            }
        }
        System.out.println();

        boolean isDouble = false;

        if (objValue != null) {
            try {
                double doubleObjValue = Double.parseDouble(objValue);
                alert(doubleObjValue);
                isDouble = true;
            } catch (Exception e) {
            }

            if (!isDouble) {
                alert(objValue);
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
