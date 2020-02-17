package com.codegym.task.task14.task1420;

/* 
GCD

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());

        if (firstNumber<=0 || secondNumber<=0) throw new NumberInputException();

        List<Integer> firstNumberDivisors = new ArrayList<>();
        List<Integer> secondNumberDivisors = new ArrayList<>();
        List<Integer> commonDivisors = new ArrayList<>();

        for (int i = firstNumber; i > 0; i--) {
            if (firstNumber % i == 0) {
                firstNumberDivisors.add(i);
            }
        }

        for (int i = secondNumber; i > 0; i--) {
            if (secondNumber % i == 0) {
                secondNumberDivisors.add(i);
            }
        }

        for (int i = 0; i < firstNumberDivisors.size(); i++) {
            for (int j = 0; j < secondNumberDivisors.size(); j++) {
                if (firstNumberDivisors.get(i) == secondNumberDivisors.get(j)) {
                    commonDivisors.add(firstNumberDivisors.get(i));
                }
            }
        }

        Collections.sort(commonDivisors);
        System.out.println(commonDivisors.get(commonDivisors.size() - 1));

    }

    public static class NumberInputException extends Exception {
        public NumberInputException() {
            System.out.println("The number is less than 1");
        }
    }
}
