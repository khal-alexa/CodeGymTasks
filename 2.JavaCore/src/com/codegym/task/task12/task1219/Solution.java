package com.codegym.task.task12.task1219;

/* 
Making a human

*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanRun, CanSwim {
        @Override
        public void run() {
            System.out.println("The human is running");
        }

        @Override
        public void swim() {
            System.out.println("The human is swimming");
        }
    }

    public class Duck implements CanSwim, CanRun, CanFly {
        @Override
        public void swim() {
            System.out.println("The duck is swimming");
        }

        @Override
        public void run() {
            System.out.println("The duck is running");
        }

        @Override
        public void fly() {
            System.out.println("The duck is flying");
        }
    }

    public class Penguin implements CanSwim, CanRun {
        @Override
        public void run() {
            System.out.println("The penguin is running");
        }

        @Override
        public void swim() {
            System.out.println("The penguin is swimming");
        }
    }

    public class Airplane implements CanRun, CanFly {
        @Override
        public void run() {
            System.out.println("The airplane is running");
        }

        @Override
        public void fly() {
            System.out.println("The airplane is flying");
        }
    }
}
