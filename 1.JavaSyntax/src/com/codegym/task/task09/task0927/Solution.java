package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> cats = new HashMap<>();
        cats.put("Vaska", new Cat("Vaska"));
        cats.put("Barsik", new Cat("Barsik"));
        cats.put("Tiger", new Cat("Tiger"));
        cats.put("Pushok", new Cat("Pushok"));
        cats.put("Tishka", new Cat("Tishka"));
        cats.put("Olly", new Cat("Olly"));
        cats.put("Kitty", new Cat("Kitty"));
        cats.put("Silver", new Cat("Silver"));
        cats.put("Grey", new Cat("Grey"));
        cats.put("Neo", new Cat("Neo"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> catSet = new HashSet<>(map.values());
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
