package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    String name=null;
    int age;
    int weight;
    String address=null;
    String color;

    public void initialize (String name) {
        this.name=name;
        age=3;
        weight=5;
        color="Grey";
    }

    public void initialize (String name, int weight, int age ) {
        this.name=name;
        this.weight=weight;
        this.age=age;
        color="Grey";
    }
    public void initialize (String name, int age ) {
        this.name=name;
        this.age=age;
        weight=5;
        color="Grey";
    }

    public void initialize (int weight, String color ) {
        this.weight=weight;
        this.color=color;
        age=3;
    }

    public void initialize (int weight, String color, String address ) {
        this.weight=weight;
        this.color=color;
        this.address=address;
        age=3;
    }

    public static void main(String[] args) {

    }
}
