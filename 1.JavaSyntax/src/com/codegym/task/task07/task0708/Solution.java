package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            strings.add(s);
        }

        String firstString = strings.get(0);
        int maxLength = firstString.length();

        for (int i = 1; i <strings.size() ; i++) {
            String s = strings.get(i);
            if (s.length()>maxLength) {
                maxLength=s.length();
            }
        }
        for (int i = 0; i <strings.size() ; i++) {
            String s = strings.get(i);
            if (s.length()==maxLength) {
                System.out.println(s);
            }
        }
    }
}
