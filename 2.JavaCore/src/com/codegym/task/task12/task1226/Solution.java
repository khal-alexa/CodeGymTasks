package com.codegym.task.task12.task1226;

/* 
Climb, fly, and run

*/

public class Solution {

    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanClimb {
        void climb();
    }

    public interface CanRun {
        void run();
    }

    public class Cat implements CanRun, CanClimb {
        @Override
        public void run() {
            System.out.println("The cat is running");
        }

        @Override
        public void climb() {
            System.out.println("The cat is climbing on the tree");
        }
    }

    public class Dog implements CanRun {
        @Override
        public void run() {
            System.out.println("The dog is running");
        }
    }

    public class Tiger extends Cat {
    }

    public class Duck implements CanRun, CanFly {
        @Override
        public void run() {
            System.out.println("The duck is running");
        }

        @Override
        public void fly() {
            System.out.println("The duck is flying");
        }
    }
}
