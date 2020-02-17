package com.codegym.task.task18.task1814;

import java.io.*;

/* 
UnsupportedFileName

*/

public class TxtInputStream extends FileInputStream {

    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        String[] strings = fileName.split("[,;:.!?\\s]+");
        if (!(strings[strings.length - 1]).equals("txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) throws IOException, UnsupportedFileNameException {
        BufferedInputStream reader = new BufferedInputStream(new TxtInputStream("C:\\Download\\file.1.part3.txt"));
        while ((reader.available()) > 0) {
            int data = reader.read();
            System.out.println(data);
        }

    }
}

