package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNum = reader.readLine();
        int number=Integer.parseInt(sNum);
        if (number>0)
            System.out.println(number*2);
        else if (number<0)
            System.out.println(number+1);
        else
            System.out.println(0);


    }

}