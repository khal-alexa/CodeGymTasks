package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int commasCounter = 0;

        FileInputStream inputStream = new FileInputStream(fileName);
        while ((inputStream.available()) > 0) {
            int data = inputStream.read();
            if (data == 44) {
                commasCounter++;
            }
        }

        System.out.println(commasCounter);
        reader.close();
        inputStream.close();
    }
}
