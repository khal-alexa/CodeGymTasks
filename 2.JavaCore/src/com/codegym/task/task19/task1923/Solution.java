package com.codegym.task.task19.task1923;

/* 
Words with numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));

        String s = "";
        while ((s = reader.readLine()) != null) {
            String[] strings = s.split(" ");
            for (int i = 0; i < strings.length; i++) {
                if (strings[i].matches("(.)*(\\d)(.)*")) {
                    System.out.println(strings[i]);
                    writer.write(strings[i] + " ");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
