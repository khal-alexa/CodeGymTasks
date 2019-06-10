package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int count=0;
        count += number%10;
        int number1=number/10;
        count += number1%10;
        int number2 = number1/10;
        count += number2%10;
        return count;

    }
}