package com.codegym.task.task20.task2011;

import java.io.*;

/*
Externalizable for apartments

*/
public class Solution {

    public static class Apartment implements Externalizable {

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(this.address);
            out.writeInt(this.year);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String fileName = "SecondFile";
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream);
        Apartment ap1 = new Apartment("Tokyo", 1990);
        ap1.writeExternal(oos);
        oos.close();

        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Apartment ap2 = new Apartment();
        ap2.readExternal(ois);
        ois.close();
        System.out.println(ap2.toString());
    }
}
