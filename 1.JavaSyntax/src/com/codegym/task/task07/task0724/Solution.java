package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        Human grandfatherBob = new Human("Bob", true, 55);
        Human grandfatherJohn = new Human("John", true, 69);
        Human grandmotherLizzy = new Human("Lizzy", false, 52);
        Human grandmotherLilly = new Human("Lilly", false, 60);
        Human fatherSam = new Human("Sam", true, 33, grandfatherBob, grandmotherLizzy);
        Human motherDorothy = new Human("Dorothy", false, 29, grandfatherJohn, grandmotherLilly);
        Human daughterSally = new Human("Sally", false, 11, fatherSam, motherDorothy);
        Human daughterEmily = new Human("Emily", false, 5, fatherSam, motherDorothy);
        Human sonJeremy = new Human("Jeremy", true, 2, fatherSam, motherDorothy);

        System.out.println(grandfatherBob.toString());
        System.out.println(grandfatherJohn.toString());
        System.out.println(grandmotherLizzy.toString());
        System.out.println(grandmotherLilly.toString());
        System.out.println(fatherSam.toString());
        System.out.println(motherDorothy.toString());
        System.out.println(daughterSally.toString());
        System.out.println(daughterEmily.toString());
        System.out.println(sonJeremy.toString());
    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}