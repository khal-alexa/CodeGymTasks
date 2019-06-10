package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] bigArray = new int[20];
        for (int i = 0; i <20 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            bigArray[i] = Integer.parseInt(reader.readLine());
        }

        int[] smallArray1 = new int[10];
        int[] smallArray2 = new int[10];

        for (int i = 0; i <10 ; i++) {
            smallArray1[i] = bigArray[i];
        }

        for (int i = 0; i <10 ; i++) {
            smallArray2[i] = bigArray[i+10];
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(smallArray2[i]);
        }
    }
}
