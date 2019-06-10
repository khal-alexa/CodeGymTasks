package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        String s4 = reader.readLine();
        int number1 = Integer.parseInt(s1);
        int number2 = Integer.parseInt(s2);
        int number3 = Integer.parseInt(s3);
        int number4 = Integer.parseInt(s4);
        if (number1>=number2 && number3>=number4) {
            if (number1>=number3) {
                System.out.println(number1);
            }
            else {
                System.out.println(number3);
            }
        }
        else if (number2>=number1 && number4>=number3) {
            if (number2>=number4) {
                System.out.println(number2);
            }
            else {
                System.out.println(number4);
            }
        }
        else if (number1>=number2 && number4>=number3) {
            if (number1>=number4) {
                System.out.println(number1);
            }
            else {
                System.out.println(number4);
            }
        }
        else if (number2>=number1 && number3>=number4) {
            if (number2>=number3) {
                System.out.println(number2);
            }
            else {
                System.out.println(number3);
            }
        }
    }
}
