package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int negativeNumbersCounter=0;
        int positiveNumbersCounter=0;
        for (int i = 0; i <3 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sNum = reader.readLine();
            int number = Integer.parseInt(sNum);
            if (number>0) {
                positiveNumbersCounter++;
            }
            else if (number<0) {
                negativeNumbersCounter++;
            }
        }
        System.out.println("Number of negative numbers: "+negativeNumbersCounter);
        System.out.println("Number of positive numbers: "+positiveNumbersCounter);

    }
}
