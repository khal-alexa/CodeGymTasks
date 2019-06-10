package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat catVasya = new Cat("Vasya", 5, 5, 10);
        Cat catBasilio = new Cat("Basilio", 3, 6, 12);
        Cat catMurka = new Cat("Murka", 2, 4, 6);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}