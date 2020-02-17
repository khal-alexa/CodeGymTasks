package com.codegym.task.task19.task1910;

/* 
Punctuation

*/

import java.io.*;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFileName));
        String s = "";
        StringBuilder sb = new StringBuilder();

        while ((s = fileReader.readLine()) != null) {
            sb.append(s);
        }
        fileReader.close();

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFileName));
        String string = sb.toString().replaceAll("\\p{Punct}", "");
        fileWriter.write(string);
        fileWriter.close();
    }
}
