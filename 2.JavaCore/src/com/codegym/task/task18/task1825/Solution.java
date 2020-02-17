package com.codegym.task.task18.task1825;

import javax.swing.plaf.basic.BasicFormattedTextFieldUI;
import java.io.*;
import java.util.*;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        List<String> allFileNames = new ArrayList<>();
        Map<Integer, String> sortedFileParts = new TreeMap<>();

        while (!(s = reader.readLine()).equals("end")) {
            allFileNames.add(s);
        }
        reader.close();

        for (int i = 1; i < allFileNames.size() + 1; i++) {
            for (String fileName : allFileNames) {
                if (fileName.endsWith(Integer.toString(i))) {
                    sortedFileParts.put(i, fileName);
                }
            }
        }
        String finalFileName = sortedFileParts.get(1);
        finalFileName = finalFileName.replace(".part1", "");

        BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(finalFileName, true));

        for (int i = 1; i < allFileNames.size() + 1; i++) {
            BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(sortedFileParts.get(i)));
            while (inputStream.available() > 0) {
                outputStream.write(inputStream.read());
            }
            inputStream.close();
        }
        outputStream.close();
    }
}
