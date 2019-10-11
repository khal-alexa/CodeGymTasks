package com.codegym.task.task12.task1227;

/* 
CanFly, CanRun, and CanSwim for the Duck, Penguin, and Toad classes

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

    public class Duck implements CanFly, CanRun, CanSwim {
        @Override
        public void fly() {
            System.out.println("The duck is flying");
        }

        @Override
        public void run() {
            System.out.println("The duck is running");
        }

        @Override
        public void swim() {
            System.out.println("The duck is swimming");
        }
    }

    public class Penguin implements CanSwim, CanRun {
        @Override
        public void swim() {
            System.out.println("The penguin is swimming");
        }

        @Override
        public void run() {
            System.out.println("The penguin is running");
        }
    }

    public class Toad implements CanSwim {
        @Override
        public void swim() {
            System.out.println("The toad is swimming");
        }
    }
}
