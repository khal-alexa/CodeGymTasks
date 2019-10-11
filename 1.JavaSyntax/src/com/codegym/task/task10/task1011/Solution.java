package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";
        int stringLength = s.length();
        System.out.println(s);

        for (int i = stringLength; i > 6 ; i--) {
            String substring = s.substring(1);
            System.out.println(substring);
            s = substring;
        }
    }

}

