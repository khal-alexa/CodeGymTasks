package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Longest sequence

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        int counter = 1;
        int longestSequence = 1;
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i).equals(numbers.get(i + 1))) {
                counter++;
            } else {
                counter = 1;
            }
            if (counter > longestSequence) {
                longestSequence = counter;
            }
        }
        System.out.println(longestSequence);
    }
}