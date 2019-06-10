package com.codegym.task.task02.task0217;

/* 
Minimum of four numbers

*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //write your code here
        int min1 = min(a, b);
        int min2 = min(c, d);
        int min3 = min(min1, min2);
        return min3;
    }

    public static int min(int a, int b) {
        //write your code here
        int minimum2 = 0;
        if (a<=b) {
            minimum2=a;
        }
        else {
            minimum2=b;
        }
        return minimum2;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}