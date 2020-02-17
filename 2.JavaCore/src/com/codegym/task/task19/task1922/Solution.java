package com.codegym.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Searching for the right lines

*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("file");
        words.add("view");
        words.add("In");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String s = "";

        while ((s = fileReader.readLine()) != null) {
            String[] strings = s.split(" ");
            int counter = 0;
            for (int i = 0; i < strings.length; i++) {
                if (words.contains(strings[i])) {
                    counter++;
                }
            }

            if (counter == 2) {
                System.out.println(s);
            }
        }
        fileReader.close();
    }
}
