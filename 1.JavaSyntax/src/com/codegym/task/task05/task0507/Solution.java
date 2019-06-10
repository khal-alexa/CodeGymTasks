package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int counter = 0;
        double sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s1 = reader.readLine();
            int number = Integer.parseInt(s1);
            if (number==-1) {
                System.out.println(sum/counter);
                break;
            }
            else {
                sum = sum + number;
                counter++;
            }
        }
    }
}

