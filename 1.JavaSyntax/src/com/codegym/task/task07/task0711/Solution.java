package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String > strings = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            strings.add(s);
        }

        for (int i = 0; i <13 ; i++) {
            String s = strings.get(strings.size()-1);
            strings.remove(strings.size()-1);
            strings.add(0, s);
        }

        for (int i = 0; i <strings.size() ; i++) {
            System.out.println(strings.get(i));
        }
    }
}
