package com.codegym.task.task04.task0433;


/* 
Seeing dollars in your future

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int counter1=10;
        while (counter1>0) {
            int counter2=10;
            while (counter2>0) {
                System.out.print("$");
                counter2--;
            }
            System.out.println();
            counter1--;
        }

        //write your code here
    }
}
