package com.codegym.task.task13.task1315;

/* 
Tom, Jerry and Spike

*/

public class Solution {
    public static void main(String[] args) {

    }

    public class Dog implements CanMove, CanEat {
        @Override
        public void move() {
            System.out.println("The dog is running");
        }

        @Override
        public void eat() {
            System.out.println("Om-nom-nom");
        }
    }

    public class Cat implements CanEat, CanMove, Edible {
        @Override
        public void eat() {
            System.out.println("The cat is eating");
        }

        @Override
        public void move() {
            System.out.println("The cat is running");
        }

        @Override
        public void beEaten() {
            System.out.println("The cat was eaten by a dog");
        }
    }

    public class Mouse implements CanMove, Edible {
        @Override
        public void move() {
            System.out.println("The mouse is running");
        }

        @Override
        public void beEaten() {
            System.out.println("Ohh, the mouse was eaten");
        }
    }

    // Can move
    public interface CanMove {
        void move();
    }

    // Can be eaten
    public interface Edible {
        void beEaten();
    }

    // Can eat
    public interface CanEat {
        void eat();
    }
}