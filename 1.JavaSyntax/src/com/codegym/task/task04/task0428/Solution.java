package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int counter = 0;
        for (int i = 0; i <3 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String sNum = reader.readLine();
            int number = Integer.parseInt(sNum);
            if (number>0) {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
