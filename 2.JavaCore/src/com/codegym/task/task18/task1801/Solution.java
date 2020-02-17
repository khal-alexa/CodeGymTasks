package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fis = new FileInputStream(fileName);
        int maxByte = 0;

        while ((fis.available()) > 0) {
            int currentByte = fis.read();
            if (currentByte > maxByte) {
                maxByte = currentByte;
            }
        }
        System.out.println(maxByte);
        fis.close();
    }
}
