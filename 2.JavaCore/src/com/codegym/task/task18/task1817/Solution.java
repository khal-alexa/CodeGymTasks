package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        int charCounter = 0;
        int spaceCounter = 0;
        String currentLine = null;

        while ((currentLine = reader.readLine()) != null) {
            charCounter += currentLine.length();
            for (int i = 0; i < currentLine.length(); i++) {
                if (Character.isSpaceChar(currentLine.charAt(i))) {
                    spaceCounter++;
                }
            }
        }
        double spaceRatio = (double) spaceCounter / charCounter * 100;
        double roundedRatio = Math.round(spaceRatio * 100.0) / 100.0;
        System.out.println(roundedRatio);
        reader.close();
    }
}
