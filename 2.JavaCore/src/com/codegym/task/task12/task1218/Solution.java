package com.codegym.task.task12.task1218;

/* 
Eat, fly, and move

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void eat() {
            System.out.println("The dog is eating");
        }

        @Override
        public void move() {
            System.out.println("The dog is running");
        }
    }

    public class Duck implements CanFly, CanMove, CanEat {
        @Override
        public void fly() {
            System.out.println("The duck is flying");
        }

        @Override
        public void move() {
            System.out.println("The duck is moving");
        }

        @Override
        public void eat() {
            System.out.println("The duck is eating");
        }
    }

    public class Car implements CanMove {
        @Override
        public void move() {
            System.out.println("The car is moving");
        }
    }

    public class Airplane implements CanMove, CanFly {
        @Override
        public void move() {
            System.out.println("The plane is moving");
        }

        @Override
        public void fly() {
            System.out.println("The plane is flying");
        }
    }
}
