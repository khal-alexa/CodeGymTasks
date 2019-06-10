package com.codegym.task.task05.task0527;

/* 
Tom and Jerry

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        //write your code here
        Dog puppyDog = new Dog ("Puppy", 10, 3);
        Cat tomCat = new Cat("Tom", 5, "Grey");
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //write your code here
    public static class Dog {
        String name;
        int weight;
        int height;

        public Dog (String name, int weight, int height) {
            this.name=name;
            this.weight=weight;
            this.height = height;

        }
    }

    public static class Cat {
        String name;
        int weight;
        String color;

        public Cat (String name, int weight, String color) {
            this.name=name;
            this.weight=weight;
            this.color=color;
        }
    }
}
