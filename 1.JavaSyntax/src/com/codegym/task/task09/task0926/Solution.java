package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> intArrays = new ArrayList<>();
        intArrays.add(new int[] {1,2,3,4,5});
        intArrays.add(new int[] {0,1});
        intArrays.add(new int[] {1,2,3,4});
        intArrays.add(new int[] {1,2,3,4,5,6,7});
        intArrays.add(new int[] {});
        return intArrays;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
