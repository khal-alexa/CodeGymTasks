package com.codegym.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;


/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arr = new ArrayList[3];
        arr[0] = new ArrayList<>();
        arr[1] = new ArrayList<>();
        arr[2] = new ArrayList<>();
        ArrayList<String> firstListOfStrings = new ArrayList<>();
        firstListOfStrings.add("Zero");
        firstListOfStrings.add("One");
        firstListOfStrings.add("Two");
        arr[0]=firstListOfStrings;
        ArrayList<String> secondListOfStrings = new ArrayList<>();
        secondListOfStrings.add("Vasya");
        secondListOfStrings.add("Petya");
        secondListOfStrings.add("Vanya");
        arr[1] = secondListOfStrings;
        ArrayList<String> thirdListOfStrings = new ArrayList<>();
        thirdListOfStrings.add("London");
        arr[2] = thirdListOfStrings;
        return arr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}