package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = 0;

        int N = Integer.parseInt(reader.readLine());
        int firstNumber = Integer.parseInt(reader.readLine());
        maximum = firstNumber;
        for (int i = 0; i <N-1 ; i++) {
            int num = Integer.parseInt(reader.readLine());
            if (num>maximum) {
                maximum = num;
            }
        }
        System.out.println(maximum);
    }
}
