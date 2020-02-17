package com.codegym.task.task19.task1904;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) throws IOException {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String data = fileScanner.nextLine();
            String[] strings = data.split(" ");
            String date = strings[3] + " " + strings[4] + " " + strings[5];
            Date birthDate = null;
            try {
                birthDate = new SimpleDateFormat("MM dd yyyy").parse(date);
            } catch (ParseException e) {

            }
            Person person = new Person(strings[2], strings[0], strings[1], birthDate);
            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
