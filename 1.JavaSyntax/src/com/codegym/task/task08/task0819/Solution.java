package com.codegym.task.task08.task0819;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        ArrayList<Cat> catsList = new ArrayList<>(cats);
        cats.remove(catsList.get(0));

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Cat cat = new Cat();
            cats.add(cat);
        }
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat {

    }
}
