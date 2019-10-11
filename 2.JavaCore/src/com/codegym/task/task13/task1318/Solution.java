package com.codegym.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = fileNameReader.readLine();
        InputStream inputStream = new FileInputStream(sourceFileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String str;

        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }

        inputStream.close();
        reader.close();
        fileNameReader.close();
    }
}