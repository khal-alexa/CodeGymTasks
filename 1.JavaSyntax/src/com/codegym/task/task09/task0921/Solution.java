package com.codegym.task.task09.task0921;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Method in a try-catch

*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers = new ArrayList<>();

        try {
            int number = Integer.parseInt(reader.readLine());
            while (true) {
                numbers.add(number);
                number = Integer.parseInt(reader.readLine());
            }
        }
        catch (IOException | NumberFormatException e) {
        }

        for (int i = 0; i <numbers.size() ; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
