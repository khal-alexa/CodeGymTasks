package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double c = a * a + b * b;
        double distance = Math.sqrt(c);
        return distance;
    }

    public static void main(String[] args) {
    }
}
