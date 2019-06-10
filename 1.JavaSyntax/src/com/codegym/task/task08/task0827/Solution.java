package com.codegym.task.task08.task0827;

import java.util.Date;

/* 
Working with dates

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        String year;
        String[] substrings;
        substrings = date.split(" ");
        year = substrings[2];
        Date beginningOfTheYear = new Date("JANUARY 1" + " " + year);
        Date currentDate = new Date(date);
        long msFromNewYear = currentDate.getTime() - beginningOfTheYear.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msFromNewYear / msDay) + 1;
        if (dayCount % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }
}
