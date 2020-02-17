package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = null;
        String fileName = "";

        try {
            while (true) {
                fileName = reader.readLine();
                inputStream = new FileInputStream(fileName);
                inputStream.read();
                inputStream.close();
            }
        } catch (FileNotFoundException e) {
            System.out.println(fileName);
        }
        reader.close();
        return;
    }
}

