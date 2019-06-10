package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] houses = new int[15];
        int oddHouseResidents = 0;
        int evenHouseResidents = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            houses[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < houses.length; i++) {
            if (i == 0 || i % 2 == 0) {
                evenHouseResidents += houses[i];
            } else {
                oddHouseResidents += houses[i];
            }
        }
        if (oddHouseResidents > evenHouseResidents) {
            System.out.println("Odd-numbered houses have more residents.");
        } else {
            System.out.println("Even-numbered houses have more residents.");
        }
    }
}
