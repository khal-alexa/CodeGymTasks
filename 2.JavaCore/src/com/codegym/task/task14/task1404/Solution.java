package com.codegym.task.task14.task1404;

/* 
Cats

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String catsName = reader.readLine();
        ArrayList<String> allCats = new ArrayList<>();
        while (!catsName.equals("")) {
            allCats.add(catsName);
            catsName = reader.readLine();
        }

        for (String element : allCats) {
            Cat cat = CatFactory.getCatByKey(element);
            if (cat instanceof MaleCat) {
                MaleCat maleCat = (MaleCat) cat;
                System.out.println(cat.toString());
            }
            else if (cat instanceof FemaleCat) {
                FemaleCat femaleCat = (FemaleCat) cat;
                System.out.println(cat.toString());
            }
            else {
                System.out.println(cat.toString());
            }
        }
    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("boss".equals(key)) {
                cat = new MaleCat("Big Boy");
            } else if ("miss".equals(key)) {
                cat = new FemaleCat("Missy");
            } else if ("smudge".equals(key)) {
                cat = new FemaleCat("Smudgey");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "I'm " + getName() + ", an alley cat";
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm a cat powerhouse named " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "I'm a cute kitty named " + getName();
        }
    }
}
