package com.codegym.task.task06.task0611;

/* 
StringHelper class

*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        for (int i = 0; i < 5; i++) {
            result = result + s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result = result + s;
        }
        return result;
    }

    public static void main(String[] args) {
    }
}
