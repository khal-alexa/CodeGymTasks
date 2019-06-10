package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            strings.add(s);
        }

        int minLength = strings.get(0).length();
        int maxLength = strings.get(0).length();

        for (int i = 1; i <strings.size() ; i++) {
            if (strings.get(i).length() < minLength) {
                minLength = strings.get(i).length();
            }
        }

        for (int i = 1; i <strings.size() ; i++) {
            if (strings.get(i).length() > maxLength) {
                maxLength = strings.get(i).length();
            }
        }

        int firstMinIndex = 0;
        int firstMaxIndex = 0;
        int minIterator=0;
        int maxIterator = 0;

        while (minIterator<strings.size()) {
            if (strings.get(minIterator).length() == minLength) {
                firstMinIndex = minIterator;
                break;
            }
            else {
                minIterator++;
            }
        }

        while (maxIterator<strings.size()) {
            if (strings.get(maxIterator).length() == maxLength) {
                firstMaxIndex = maxIterator;
                break;
            }
            else {
                maxIterator++;
            }
        }

        if (firstMinIndex < firstMaxIndex) {
            System.out.println(strings.get(firstMinIndex));
        }
        else {
            System.out.println(strings.get(firstMaxIndex));
        }
    }
}
