package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        System.out.println(convertEurToUsd(100, 1.11));
        System.out.println(convertEurToUsd(50, 1.315));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        double usd = eur*exchangeRate;
        return usd;
    }
}
