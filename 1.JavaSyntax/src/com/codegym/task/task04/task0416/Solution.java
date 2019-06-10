package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        double time = Double.parseDouble(s1);
        if (time%5 < 3 ) {
            System.out.println("green");
        }
        else if (time%5>=3 && time%5<4 ) {
            System.out.println("yellow");
        }
        else {
            System.out.println("red");
        }


    }
}