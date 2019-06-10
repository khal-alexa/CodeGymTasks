package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(catGrandfather, fatherName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }

        Cat(Cat father, String name) {
            this.father = father;
            this.name = name;
        }

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }


        @Override
        public String toString() {
            if (mother == null && father == null)
                return "The cat's name is " + name + ", no mother" + ", no father ";
            else if (mother == null)
                return "The cat's name is " + name + ", no mother, " + father.name + " is the father ";
            else if (father == null)
                return "The cat's name is " + name + ", " + mother.name + " is the mother, no father ";
            else
                return "The cat's name is " + name + ", " + mother.name + " is the mother, " + father.name + " is the father ";
        }
    }

}
