package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strings.add(reader.readLine());
        }
        for (int i = 0; i < strings.size() - 1; i++) {
            if (strings.get(i).length() <= strings.get(i + 1).length()) {
                continue;
            } else {
                System.out.println(i + 1);
                break;
            }
        }
    }
}

