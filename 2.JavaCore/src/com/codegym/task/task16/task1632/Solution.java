package com.codegym.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread thread1 = new TestThread1();
        Thread thread2 = new TestThread2();
        Thread thread3 = new TestThread3();
        Thread thread4 = new TestThread4();
        Thread thread5 = new TestThread5();
        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);
    }

    public static void main(String[] args) {
        TestThread4 thread = new TestThread4();
        thread.start();
        thread.showWarning();
    }

    public static class TestThread1 extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class TestThread2 extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class TestThread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Hurray");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }

    public static class TestThread4 extends Thread implements Message {
        @Override
        public void run() {
                while (!isInterrupted()) {
                }
        }

        @Override
        public void showWarning() {
            System.out.println("Warning");
            interrupt();
        }
    }

    public static class TestThread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int total = 0;
            String str = null;
            try {
                while (!(str = reader.readLine()).equals("N")) {
                    int number = Integer.parseInt(str);
                    total += number;
                }
            } catch (IOException e) {
            }
            System.out.println(total);
        }
    }
}