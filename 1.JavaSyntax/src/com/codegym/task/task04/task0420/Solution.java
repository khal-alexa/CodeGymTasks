package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

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
        if (number1<=number2 && number2<=number3) {
            System.out.println(number3+" "+number2+" "+number1);
        }
        else if (number2<=number1 && number1<=number3) {
            System.out.println(number3+" "+number1+" "+number2);
        }
        else if (number3<=number1 && number1<=number2){
            System.out.println(number2+" "+number1+" "+number3);
        }
        else if (number1<=number3 && number3<=number2) {
            System.out.println(number2+" "+number3+" "+number1);
        }
        else if (number2<=number3 && number3<=number1) {
            System.out.println(number1+" "+number3+" "+number2);
        }
        else if (number3<=number2 && number2<=number1) {
            System.out.println(number1+" "+number2+" "+number3);
        }

    }
}
