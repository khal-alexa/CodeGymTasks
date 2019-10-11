package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = consoleReader.readLine();
        List<Integer> numbers = new ArrayList<>();
        InputStream inputStream = new FileInputStream(sourceFileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String str;

        while ((str = reader.readLine()) != null) {
            int number = Integer.parseInt(str);
            numbers.add(number);
        }

        inputStream.close();

        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        Collections.sort(evenNumbers);

        for (Integer element : evenNumbers) {
            System.out.println(element);
        }
    }
}
