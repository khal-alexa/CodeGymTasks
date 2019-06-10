package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strings.add(reader.readLine());
        }

        ArrayList<String> result = doubleValues(strings);

        for (int i = 0; i <result.size() ; i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        int counter = 1;
        for (int i = 0; i <list.size() ; i=i+2) {
            list.add(i+1, list.get(i));
        }
        return list;
    }
}
