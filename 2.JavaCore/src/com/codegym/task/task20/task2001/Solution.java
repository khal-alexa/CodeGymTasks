package com.codegym.task.task20.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Reading and writing to a file: Human

*/
public class Solution {
    public static void main(String[] args) {
        // Update the string passed to the createTempFile method based on the path to a file on your hard drive
        try {
//            File yourFile = File.createTempFile("ForthFile", null);
            String fileName = "SecondFile";
            OutputStream outputStream = new FileOutputStream(fileName);
            InputStream inputStream = new FileInputStream(fileName);

            Human smith = new Human("Smith");
            smith.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            // Check that smith is equal to somePerson
            System.out.println(smith.equals(somePerson));
            System.out.println(smith.name + somePerson.name);
            for (Asset asset: somePerson.assets) {
                System.out.println(asset.getName() + " " + asset.getPrice());
            }

        } catch (IOException e) {
            // e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            // e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public void save(OutputStream outputStream) throws Exception {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            String isAssetsPresent = assets.size() > 0 ? "yes" : "no";
            int assetsQuantity = assets.size();
            objectOutputStream.writeObject(name);
            objectOutputStream.writeObject(isAssetsPresent);

            if (assets != null) {
                objectOutputStream.writeInt(assetsQuantity);
                for (int i = 0; i < assets.size(); i++) {
                    objectOutputStream.writeObject(assets.get(i));
                }
            }
        }

        public void load(InputStream inputStream) throws Exception {
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            name = (String) objectInputStream.readObject();
            String isAssetsPresent = (String) objectInputStream.readObject();
            if (isAssetsPresent.equals("yes")) {
                int assetsQuantity = objectInputStream.readInt();
                for (int i = 0; i < assetsQuantity; i++) {
                    assets.add((Asset) objectInputStream.readObject());
                }
            }
        }
    }
}
