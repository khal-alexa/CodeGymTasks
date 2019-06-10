package com.codegym.task.task06.task0612;

/* 
Calculator

*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a+b;
        return sum;
    }

    public static int minus(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static double divide(int a, int b) {
        double result = (double)a/(double)b;
        return result;
    }

    public static double percent(int a, int b) {
        double percent = ((double)a/100)*(double)b;
        return percent;
    }

    public static void main(String[] args) {
        System.out.println(divide(5,2));
    }
}