package com.codegym.task.task19.task1926;

/* 
Mirror image

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String s = "";

        while ((s = fileReader.readLine()) != null) {
            StringBuilder reversedString = new StringBuilder();
            reversedString.append(s);
            reversedString = reversedString.reverse();
            System.out.println(reversedString);
        }
        fileReader.close();
    }
}
