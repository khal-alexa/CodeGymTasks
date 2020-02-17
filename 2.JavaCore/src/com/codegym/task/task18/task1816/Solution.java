package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader((new FileReader(args[0])));

        int letterCounter = 0;
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            for (int i = 0; i < currentLine.length(); i++) {
                if (Character.isLetter(currentLine.charAt(i))) {
                    letterCounter++;
                }
            }
        }
        System.out.println(letterCounter);
        reader.close();
    }
}
