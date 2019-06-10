package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> result = new HashSet<Cat>();

        for (int i = 0; i < 4; i++) {
            Cat cat = new Cat();
            result.add(cat);
        }

        return result;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            dogs.add(dog);
        }
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        Set<Object> copy = new HashSet<>(pets);
        for (Cat cat: cats) {
            for (Object pet: copy) {
                if (cat.equals(pet)) {
                    pets.remove(pet);
                }
            }
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        for (Object pet: pets) {
            System.out.println(pet);
        }
    }

    public static class Cat {
    }

    public static class Dog{}
}
