package com.codegym.task.task19.task1913;

/* 
Output only digits

*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream console = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);

        testString.printSomething();

        String data = outputStream.toString();
        System.setOut(console);
        String result = "";

        for (int i = 0; i < data.length(); i++) {
            char currentChar = data.charAt(i);
            if (Character.isDigit(currentChar)) {
                result = result + currentChar;
            }
        }

        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("This 1 text 23 is 4 f5-6or7 tes8ting");
        }
    }
}
