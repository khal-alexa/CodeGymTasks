package com.codegym.task.task19.task1909;

/* 
Changing punctuation marks

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        List<String> strings = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(firstFileName));
        String s = "";

        while ((s = fileReader.readLine()) != null) {
            strings.add(s);
        }
        fileReader.close();

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFileName));
        for (int i = 0; i < strings.size(); i++) {
            String str = strings.get(i).replace(".", "!");
            fileWriter.write(str);
        }
        fileWriter.close();
    }
}
