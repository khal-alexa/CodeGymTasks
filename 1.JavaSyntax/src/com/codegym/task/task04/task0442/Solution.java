package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int sum = 0;
        while (true) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s1 = reader.readLine();
            int number = Integer.parseInt(s1);
            if (number==-1) {
                sum += number;
                System.out.println(sum);
                break;
            }
            else {
                sum += number;
            }
        }
    }
}
