package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    //write your code here
    int top;
    int left;
    int width;
    int height;


    public void initialize(int top, int left, int width, int height) {
        this.top=top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top=top;
        this.left = left;
        width = 0;
        height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top=top;
        this.left = left;
        this.width = width;
        height = this.width;
    }

    public void initialize(Rectangle rectangle) {
        this.top=rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
