package com.codegym.task.task18.task1828;

/* 
Prices 2

*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
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


        if (args.length > 0 && args[0].equals("-u")) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            String id = String.format("%-8s", args[1]);
            for (int i = 0; i < allLines.size(); i++) {
                String str = allLines.get(i);
                if (str.startsWith(id)) {
                    String productName = String.format("%-30s", args[2]);
                    String price = String.format("%-8s", args[3]);
                    String quantity = String.format("%-4s", args[4]);
                    String updatedString = id + productName + price + quantity;
                    allLines.set(i, updatedString);
                }
                writer.write(allLines.get(i) + "\n");
            }
            writer.close();
        } else if (args.length > 0 && args[0].equals("-d")) {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            String id = String.format("%-8s", args[1]);
            int indexToRemove = -1;
            for (int i = 0; i < allLines.size(); i++) {
                String str = allLines.get(i);
                if (str.startsWith(id)) {
                    indexToRemove = i;
                    System.out.println(indexToRemove);
                }
            }
            if (indexToRemove >= 0) {
                allLines.remove(indexToRemove);
            }
            System.out.println(allLines.size());
            for (int i = 0; i < allLines.size(); i++) {
                writer.write(allLines.get(i) + "\n");
            }
            writer.close();
        }
    }
}
