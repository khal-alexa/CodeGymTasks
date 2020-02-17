package com.codegym.task.task20.task2025;

/* 
Number algorithms

*/
public class Solution {
    public static long[] getNumbers(long N) {
        long[] result = new long[100];
        int arrayIndex = 0;
        for (int i = 0; i < N; i++) {
            long number = i;
            int exponent = (int) (Math.log10(number) + 1);
            char[] digits = String.valueOf(number).toCharArray();
            long calculatedNumber = 0;
            for (int j = 0; j < digits.length; j++) {
                calculatedNumber += (long) Math.pow(digits[j], exponent);
                System.out.println(calculatedNumber);
            }
            if (number == calculatedNumber) {
                result[arrayIndex] = number;
                arrayIndex++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        long[] fullArray = getNumbers(400);
//        for (int i = 0; i < fullArray.length; i++) {
//            System.out.println(fullArray[i]);
//    }
    }
}
