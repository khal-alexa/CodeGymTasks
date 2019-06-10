package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int number1 = Integer.parseInt(s1);
        int number2 = Integer.parseInt(s2);
        int number3 = Integer.parseInt(s3);
        if (number1!=number2 && number2==number3) {
            System.out.println(1);
        }
        else if (number2!=number1 && number1==number3) {
            System.out.println(2);
        }
        else if (number3!=number1 && number1==number2) {
            System.out.println(3);
        }

    }
}
