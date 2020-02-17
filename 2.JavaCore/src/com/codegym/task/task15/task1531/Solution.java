package com.codegym.task.task15.task1531;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;

/* 
Factorial

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(factorial(input));
    }

    public static String factorial(int n) {
        BigInteger factorial = BigInteger.valueOf(1);
        if (n < 0) {
            factorial = BigInteger.valueOf(0);
        } else if (n == 0) {
            factorial = BigInteger.valueOf(1);
        } else {
            for (int i = 1; i <= n; i++) {
                BigInteger number = BigInteger.valueOf(i);
                factorial = factorial.multiply(number);
            }
        }
        return factorial.toString();
    }
}
