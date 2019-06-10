package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        int coordinate1 = Integer.parseInt(s1);
        int coordinate2 = Integer.parseInt(s2);
        if (coordinate1>0 && coordinate2>0) {
            System.out.println(1);
        }
        else if (coordinate1<0 && coordinate2>0) {
            System.out.println(2);
        }
        else if (coordinate1<0 && coordinate2<0) {
            System.out.println(3);
        }
        else if (coordinate1>0 && coordinate2<0) {
            System.out.println(4);
        }
    }
}
