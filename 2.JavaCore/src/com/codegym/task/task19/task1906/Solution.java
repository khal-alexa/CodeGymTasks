package com.codegym.task.task19.task1906;

/* 
Even characters

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

        FileReader fileReader = new FileReader(firstFileName);
        List<Integer> symbols = new ArrayList<>();

        while (fileReader.ready()) {
            symbols.add(fileReader.read());
        }

        fileReader.close();

        FileWriter writer = new FileWriter(secondFileName);
        for (int i = 0; i < symbols.size(); i++) {
            if ((i + 1) % 2 == 0) {
                writer.write(symbols.get(i));
            }
        }
        writer.close();
    }
}
