package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;


    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        //write your code here
        int totalPoints = strength*weight-age;
        int anotherCatPoints = anotherCat.strength*anotherCat.weight-anotherCat.age;
        if (totalPoints>anotherCatPoints) {
            return true;
        }
        else {
            return false;
        }

    }

    public static void main(String[] args) {

    }
}
