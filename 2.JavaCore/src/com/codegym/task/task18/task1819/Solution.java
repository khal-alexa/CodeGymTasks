package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();

        FileInputStream firstFileReader = new FileInputStream(firstFileName);
        FileInputStream secondFileReader = new FileInputStream(secondFileName);

        List<Integer> byteArray = new ArrayList<>();

        while ((secondFileReader.available()) > 0) {
            int data = secondFileReader.read();
            byteArray.add(data);
        }

        while ((firstFileReader.available()) > 0) {
            int data = firstFileReader.read();
            byteArray.add(data);
        }

        reader.close();
        firstFileReader.close();
        secondFileReader.close();
        FileOutputStream writer = new FileOutputStream(firstFileName);

        for (int i = 0; i < byteArray.size(); i++) {
            writer.write(byteArray.get(i));
        }
        writer.close();
    }
}
