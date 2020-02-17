package com.codegym.task.task18.task1827;

/* 
Prices

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        List<String> allLines = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        String s = "";

        while ((s = fileReader.readLine()) != null) {
            allLines.add(s);
        }
        fileReader.close();

        int maxId = 0;
        for (String string : allLines) {
            String id = string.substring(0, 8);
            id = id.replaceAll("[^0-9]", "");
            int idNumber = Integer.valueOf(id);
            if (idNumber > maxId) {
                maxId = idNumber;
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        if (args.length != 0) {
            String newId = Integer.toString(maxId + 1);
            String productName = String.format("%-30s", args[1]);
            String price = String.format("%-8s", args[2]);
            String quantity = String.format("%-4s", args[3]);
            String newFileLine = newId + productName + price + quantity;
            allLines.add(newFileLine);
            writer.write("\n");
            writer.write(allLines.get(allLines.size() - 1));
        }
        writer.close();
    }
}
