package com.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
A list and some threads

*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        SpecialThread spThread1 = new SpecialThread();
        SpecialThread spThread2 = new SpecialThread();
        SpecialThread spThread3 = new SpecialThread();
        SpecialThread spThread4 = new SpecialThread();
        SpecialThread spThread5 = new SpecialThread();

        Thread thread1 = new Thread(spThread1);
        Thread thread2 = new Thread(spThread2);
        Thread thread3 = new Thread(spThread3);
        Thread thread4 = new Thread(spThread4);
        Thread thread5 = new Thread(spThread5);

        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
