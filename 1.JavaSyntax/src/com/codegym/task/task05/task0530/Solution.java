package com.codegym.task.task05.task0530;

import java.io.*;

/* 
Boss, something weird is happening

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        int a=Integer.parseInt(a1);
        int b=Integer.parseInt(b1);

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}
