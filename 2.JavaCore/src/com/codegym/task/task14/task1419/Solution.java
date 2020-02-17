package com.codegym.task.task14.task1419;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Exception invasion

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] numbers = new int[2];
            System.out.println(numbers[4]);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int num = Integer.parseInt("aaa");
            System.out.println(num);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = "java";
            System.out.println(s.charAt(10));
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String fileName = "ThirdFile";
            FileInputStream inStream = new FileInputStream(fileName);
            int n = inStream.read();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Map<String, String> map = new HashMap<String, String>(-1, (float) 0.75);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] n = new int[-2];
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Number[] numbers = new Double[2];
            numbers[0] = new Integer(4);
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Object o = new Integer(42);
            String s = (String) o;
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
