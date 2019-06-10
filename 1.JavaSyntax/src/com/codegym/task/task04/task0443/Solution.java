package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        int year =Integer.parseInt(s1);
        int month =Integer.parseInt(s2);
        int date =Integer.parseInt(s3);
        System.out.println("My name is "+name+".");
        System.out.println("I was born on "+month+"/"+date+"/"+year);
    }
}
