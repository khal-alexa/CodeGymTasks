package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int number = Integer.parseInt(sNum);
        if (number < 10) {
            if (number % 2 == 0) {
                System.out.println("even single-digit number");
            } else {
                System.out.println("odd single-digit number");
            }
        } else if (number >= 10 && number < 100) {
            if (number % 2 == 0) {
                System.out.println("even two-digit number");
            } else {
                System.out.println("odd two-digit number");
            }

        } else if (number >= 100 && number < 1000) {
            if (number % 2 == 0) {
                System.out.println("even three-digit number");
            }
             else {
                System.out.println("odd three-digit number");
            }

        }
    }
}
