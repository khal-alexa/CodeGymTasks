package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        String s = "";

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (!((s = fileReader.readLine()) == null)) {
            String[] parts = s.split(" ");
            if (parts[0].equals(args[0])) {
                System.out.println(s);
            }
        }
        reader.close();
        fileReader.close();
    }
}
