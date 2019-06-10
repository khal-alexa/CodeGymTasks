package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Human daughterSara = new Human("Sara", false, 5);
        Human daughterVikky = new Human("Victoria", false, 15);
        Human sonShawn = new Human("Shawn", true, 9);
        Human fatherJohn = new Human("John", true, 45, Arrays.asList(daughterSara, daughterVikky, sonShawn));
        Human motherAngelina = new Human("Angelina", false, 40, Arrays.asList(daughterSara, daughterVikky, sonShawn));
        Human grandmotherAnna = new Human("Anna", false, 65, Arrays.asList(motherAngelina));
        Human grandmotherBekky = new Human("Beth", false, 70, Arrays.asList(fatherJohn));
        Human grandfatherSam = new Human("Sam", true, 69, Arrays.asList(motherAngelina));
        Human grandfatherWill = new Human("William", true, 74, Arrays.asList(fatherJohn));

        ArrayList<Human> family = new ArrayList<>(Arrays.asList(daughterSara, daughterVikky, sonShawn, fatherJohn, motherAngelina, grandfatherSam, grandfatherWill, grandmotherAnna, grandmotherBekky));
        for (int i = 0; i < family.size(); i++) {
            System.out.println(family.get(i).toString());
        }
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        List<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, List<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }
        //write your code here

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
