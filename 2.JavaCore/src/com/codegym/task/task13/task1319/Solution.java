package com.codegym.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String textLine;
        List<String> data = new ArrayList<>();

        while (!(textLine = reader.readLine()).equals("exit")) {
            data.add(textLine);
        }
        data.add(textLine);

        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter writeToAFile = new BufferedWriter(fileWriter);

        for (String element: data) {
            writeToAFile.write(element + "\n");
        }

        writeToAFile.close();
    }
}
