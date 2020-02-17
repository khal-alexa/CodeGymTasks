package com.codegym.task.task20.task2014;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution

*/
public class Solution implements Serializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        System.out.println(new Solution(4));

        OutputStream outputStream = new FileOutputStream("SecondFile");
        FileInputStream inputStream = new FileInputStream("SecondFile");

        Solution savedObject = new Solution(12);
        savedObject.writeToFile(outputStream);

        Solution loadedObject = new Solution(-1);
        loadedObject.readFromFile(inputStream);

        System.out.println(loadedObject.string);
        System.out.println(savedObject.string);

    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }

    public void writeToFile (OutputStream out) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(this);
    }

    public Solution readFromFile (InputStream in) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(in);
        return  (Solution) ois.readObject();
    }

}
