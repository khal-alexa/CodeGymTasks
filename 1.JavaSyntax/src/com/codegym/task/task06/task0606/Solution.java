package com.codegym.task.task06.task0606;

import java.io.*;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        while (number !=0) {
            int numeral = number%10;
            if (numeral%2 == 0) {
                even++;
            }
            else {
                odd++;
            }
            number = number/10;
        }
        System.out.println("Even: "+even+" Odd: "+odd);
    }
}
