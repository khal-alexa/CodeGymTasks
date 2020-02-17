package com.codegym.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Transactionality

*/

public class Solution {
    public static List<String> allLines = new ArrayList<>();
    public static List<String> linesForRemoval = new ArrayList<>();

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String firstFileName = reader.readLine();
            String secondFileName = reader.readLine();
            BufferedReader firstFileReader = new BufferedReader(new FileReader(firstFileName));
            BufferedReader secondFileReader = new BufferedReader(new FileReader(secondFileName));
            String s = null;

            while (!((s = firstFileReader.readLine()) == null)) {
                allLines.add(s);
            }

            while (!((s = secondFileReader.readLine()) == null)) {
                linesForRemoval.add(s);
            }

            Solution solution = new Solution();
            solution.joinData();

            reader.close();
            firstFileReader.close();
            secondFileReader.close();
        } catch (IOException e) {
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(linesForRemoval)) {
            allLines.removeAll(linesForRemoval);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
