package com.codegym.task.task20.task2013;

import java.io.*;
import java.util.List;

/* 
Externalizable Person

*/
public class Solution {
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person() {

        }

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(firstName);
            out.writeObject(lastName);
            out.writeObject(father);
            out.writeObject(mother);
            out.writeInt(age);
            out.writeObject(children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            firstName = (String) in.readObject();
            lastName = (String) in.readObject();
            father = (Person)in.readObject();
            mother = (Person)in.readObject();
            age = in.readInt();
            children = (List)in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream outputStream = new FileOutputStream("SecondFile");
        ObjectOutputStream objectOutput = new ObjectOutputStream(outputStream);


        Person person = new Person("John", "Smith", 39);
        person.writeExternal(objectOutput);

        objectOutput.close();
        FileInputStream inputStream = new FileInputStream("SecondFile");
        ObjectInputStream objectInput = new ObjectInputStream(inputStream);

        Person newPerson = new Person();
        newPerson.readExternal(objectInput);

        System.out.println(newPerson.age);

    }
}
