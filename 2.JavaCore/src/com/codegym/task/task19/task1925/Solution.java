package com.codegym.task.task19.task1925;

/* 
Long words

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        List<String> longWords = new ArrayList<>();
        String s = "";

        while ((s = fileReader.readLine()) != null) {
            String[] words = s.split(" ");
            for (int i = 0; i < words.length; i++) {
                if (words[i].length() > 6) {
                    longWords.add(words[i]);
                }
            }
        }
        fileReader.close();

        for (int i = 0; i < longWords.size() - 1; i++) {
            writer.write(longWords.get(i) + ",");
        }
        writer.write(longWords.get(longWords.size()-1));
        writer.close();
    }
}
