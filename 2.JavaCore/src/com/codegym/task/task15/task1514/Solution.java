package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(0.01, "one");
        labels.put(0.02, "two");
        labels.put(0.03, "three");
        labels.put(0.04, "four");
        labels.put(0.05, "five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
