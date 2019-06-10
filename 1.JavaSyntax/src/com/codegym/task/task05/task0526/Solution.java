package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man1 = new Man("John", 25, "Miami");
        Man man2 = new Man("Jared", 40, "New York");
        Woman woman1 = new Woman("Katherine", 22, "Tokyo");
        Woman woman2 = new Woman("Kate", 35, "Moscow");
        System.out.println(man1.name+" "+man1.age+" "+man1.address);
        System.out.println(man2.name+" "+man2.age+" "+man2.address);
        System.out.println(woman1.name+" "+woman1.age+" "+woman1.address);
        System.out.println(woman2.name+" "+woman2.age+" "+woman2.address);
    }

    //write your code here
    public static class Man {
        String name;
        int age;
        String address;

        public Man (String name, int age, String address) {
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman (String name, int age, String address) {
            this.name=name;
            this.age=age;
            this.address=address;
        }
    }
}
