package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] substrings;
        substrings = s.split(" ");

        List<String> listOfWords = new ArrayList<>();
        for (int i = 0; i < substrings.length; i++) {
            listOfWords.add(substrings[i]);
        }

        for (int i = 0; i < listOfWords.size(); i++) {
            String string = listOfWords.get(i);
            string = string.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
            if (string.equals("")) {
                listOfWords.remove(i);
                i--;
            } else {
                String modifiedString = string.substring(0, 1).toUpperCase() + string.substring(1);
                listOfWords.set(i, modifiedString);
            }
        }

        String finalString = "";

        for (int i = 0; i < listOfWords.size(); i++) {
            finalString = finalString + listOfWords.get(i);
            int lastElementIndex = listOfWords.size() - 1;
            if (i < lastElementIndex) {
                finalString = finalString + " ";
            }
        }
        System.out.println(finalString);
    }
}
