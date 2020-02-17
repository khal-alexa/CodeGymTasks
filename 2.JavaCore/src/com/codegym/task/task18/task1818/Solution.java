package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();

        BufferedReader secondFileReader = new BufferedReader(new FileReader(fileName2));
        BufferedReader thirdFileReader = new BufferedReader(new FileReader(fileName3));
        BufferedWriter firstFileWriter = new BufferedWriter(new FileWriter(fileName1));

        String str = null;
        while ((str = secondFileReader.readLine()) != null) {
            firstFileWriter.write(str);
        }

        while ((str = thirdFileReader.readLine()) != null) {
            firstFileWriter.write(str);
        }

        firstFileWriter.close();
        secondFileReader.close();
        thirdFileReader.close();
    }
}
