package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class

*/


public class Rectangle {
    //write your code here
    int top;
    int left;
    int width;
    int height;

    public Rectangle (int left, int top, int width, int height) {
        this.left=left;
        this.top=top;
        this.width=width;
        this.height=height;
    }

    public Rectangle (int left, int top) {
        this.left=left;
        this.top=top;
        width=0;
        height=0;
    }

    public Rectangle (int left, int top, int width) {
        this.left=left;
        this.top=top;
        this.width=width;
        height=this.width;
    }

    public Rectangle (Rectangle other) {
        this.left=other.left;
        this.top=other.top;
        this.width=other.width;
        this.height=other.height;
    }

    public static void main(String[] args) {

    }
}
