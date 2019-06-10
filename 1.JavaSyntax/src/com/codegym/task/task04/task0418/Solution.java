package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sInt1 = reader.readLine();
        String sInt2 = reader.readLine();
        int number1 = Integer.parseInt(sInt1);
        int number2 = Integer.parseInt(sInt2);
        if (number1<number2) {
            System.out.println(number1);
        }
        else if (number1>number2) {
            System.out.println(number2);
        }
        else {
            System.out.println(number1);
        }
    }
}