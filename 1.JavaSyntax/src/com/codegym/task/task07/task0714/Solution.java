package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            strings.add(reader.readLine());
        }
        strings.remove(2);
        for (int i = strings.size()-1; i >=0 ; i--) {
            System.out.println(strings.get(i));
        }
    }
}


