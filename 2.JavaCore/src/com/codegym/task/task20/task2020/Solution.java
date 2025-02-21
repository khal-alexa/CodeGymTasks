package com.codegym.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Serializing people

*/
public class Solution {

    public static class Person implements Serializable {
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }

        public void save(ObjectOutputStream outputStream) throws IOException {
            outputStream.writeObject(this);
        }

        public void load(ObjectInputStream inputStream) throws IOException, ClassNotFoundException {
            Person person = (Person) inputStream.readObject();
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) {

    }
}
