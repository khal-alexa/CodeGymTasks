package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException, ParseException {
        String fileName = args[0];
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String s = "";

        while ((s = reader.readLine()) != null) {
            String[] strings = s.split(" ");
            String name = "";
            String date = "";
            for (int i = 0; i < strings.length; i++) {
                if (Character.isLetter(strings[i].charAt(0))) {
                    name = name + strings[i] + " ";
                } else {
                    date = date + strings[i] + " ";
                }
            }
            name = name.substring(0, name.length() - 1);
            date = date.substring(0, date.length() - 1);
            Date birthDate = new SimpleDateFormat("MM dd yyyy").parse(date);
            Person person = new Person(name, birthDate);
            PEOPLE.add(person);
        }
        reader.close();
    }
}
