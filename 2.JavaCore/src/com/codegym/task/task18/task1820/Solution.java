package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        StringBuilder sb = new StringBuilder();
        BufferedReader fileReader = new BufferedReader(new FileReader(file1));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file2));

        String stringFromFile1 = fileReader.readLine();
        String[] strings = stringFromFile1.split(" ");

        for (int i = 0; i < strings.length; i++) {
            float number = Float.parseFloat(strings[i]);
            int roundedNum = Math.round(number);
            sb.append(roundedNum).append(" ");
        }
        String stringToWrite = sb.toString();
        fileWriter.write(stringToWrite);

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
