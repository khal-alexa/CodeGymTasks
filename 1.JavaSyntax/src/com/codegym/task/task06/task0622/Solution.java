package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            numbers.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(numbers);
        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
