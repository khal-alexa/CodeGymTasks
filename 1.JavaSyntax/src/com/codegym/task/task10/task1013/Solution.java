package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private String lastName;
        private int id;
        private String address;
        private boolean sex;

        public Human (String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        public Human (String name) {
            this.name = name;
        }

        public Human(String name, int age, String lastName) {
            this.name = name;
            this.age = age;
            this.lastName = lastName;
        }

        public Human(String name, String lastName, boolean sex) {
            this.name = name;
            this.lastName = lastName;
            this.sex = sex;
        }

        public Human(String name, int age, String lastName, int id, String address, boolean sex) {
            this.name = name;
            this.age = age;
            this.lastName = lastName;
            this.id = id;
            this.address = address;
            this.sex = sex;
        }

        public Human(String name, String lastName, String address) {
            this.name = name;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(String name, int age, String lastName, String address) {
            this.name = name;
            this.age = age;
            this.lastName = lastName;
            this.address = address;
        }

        public Human(String name, int age, String lastName, int id) {
            this.name = name;
            this.age = age;
            this.lastName = lastName;
            this.id = id;
        }

        public Human(String name, String lastName, int id, String address) {
            this.name = name;
            this.lastName = lastName;
            this.id = id;
            this.address = address;
        }

        public Human(String name, int age, String lastName, int id, boolean sex) {
            this.name = name;
            this.age = age;
            this.lastName = lastName;
            this.id = id;
            this.sex = sex;
        }
    }
}
