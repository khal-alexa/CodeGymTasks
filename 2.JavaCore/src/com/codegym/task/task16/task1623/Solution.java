package com.codegym.task.task16.task1623;

/* 
Creating threads recursively

*/

public class Solution {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());
    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super(String.valueOf(++createdThreadCount));
            start();
        }

        @Override
        public void run() {
            if (createdThreadCount<Solution.count) {
                Thread thread = new GenerateThread();
                System.out.println(thread.toString());
            }
        }

        @Override
        public String toString() {
            return String.format("%s created", getName());
        }
    }
}
