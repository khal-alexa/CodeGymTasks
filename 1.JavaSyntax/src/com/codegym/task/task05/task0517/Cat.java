package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    String name;
    int age;
    int weight;
    String address = null;
    String color;

    public Cat(String name) {
        this.name = name;
        age = 5;
        weight = 6;
        color = "Brown";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        color = "Brown";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        weight = 6;
        color = "Brown";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.color = color;
        name = null;
        age = 5;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
        age = 5;
    }

    public static void main(String[] args) {

    }
}
