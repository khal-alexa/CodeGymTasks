package com.codegym.task.task05.task0512;

/* 
Create a Circle class

*/

public class Circle {
    //write your code here
    int centerX;
    int centerY;
    int radius;
    int width;
    int color;

    public void initialize (int centerX, int centerY, int radius) {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        width=10;
        color=3;
    }

    public void initialize (int centerX, int centerY, int radius, int width) {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        color=3;
    }

    public void initialize (int centerX, int centerY, int radius, int width, int color) {
        this.centerX=centerX;
        this.centerY=centerY;
        this.radius=radius;
        this.width=width;
        this.color=color;
    }

    public static void main(String[] args) {

    }
}
