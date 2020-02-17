package com.codegym.task.task19.task1908;

/* 
Picking out numbers

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFileName));
        String s = "";
        List<String> strings = new ArrayList<>();

        while ((s = fileReader.readLine()) != null) {
            String[] stringArray = s.split(" ");
            for (int i = 0; i < stringArray.length; i++) {
                strings.add(stringArray[i]);
            }
        }
        fileReader.close();

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFileName));
        for (int i = 0; i < strings.size(); i++) {
            if (isInteger(strings.get(i))) {
                fileWriter.write(strings.get(i) + " ");
            }
        }
        fileWriter.close();
    }

    public static boolean isInteger(String s) {
        boolean isInteger = false;
        try {
            int number = Integer.parseInt(s);
            isInteger = true;
        } catch (NumberFormatException e) {
        }
        return isInteger;
    }
}
