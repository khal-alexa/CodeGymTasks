package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sYear = reader.readLine();
        int year = Integer.parseInt(sYear);
        if (year%400==0)
            System.out.println("Number of days in the year: 366");
        else if (year%100==0)
            System.out.println("Number of days in the year: 365");
        else if (year%4==0)
            System.out.println("Number of days in the year: 366");
        else
            System.out.println("Number of days in the year: 365");
    }
}