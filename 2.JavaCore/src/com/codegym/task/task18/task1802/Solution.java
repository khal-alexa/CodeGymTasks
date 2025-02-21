package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int minByte = 255;

        FileInputStream fileInputStream = new FileInputStream(fileName);
        while ((fileInputStream.available()) > 0) {
            int currentByte = fileInputStream.read();
            if (currentByte < minByte) {
                minByte = currentByte;
            }
        }
        System.out.println(minByte);
        fileInputStream.close();
    }
}
