package com.codegym.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        String argument = args[0];

        if (argument.equals("-c")) {
            if (args[2].equals("m")) {
                allPeople.add(Person.createMale(args[1], new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[3])));
            } else if (args[2].equals("f")) {
                allPeople.add(Person.createFemale(args[1], new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[3])));
            }
            int id = allPeople.size() - 1;
            System.out.println(id);
        } else if (argument.equals("-u")) {
            int id = Integer.parseInt(args[1]);
            Person person = allPeople.get(id);
            person.setName(args[2]);
            if (args[3].equals("f")) {
                person.setSex(Sex.FEMALE);
            } else {
                person.setSex(Sex.MALE);
            }
            person.setBirthDate(new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[4]));
            allPeople.remove(id);
            allPeople.add(id, person);
        } else if (argument.equals("-d")) {
            int id = Integer.parseInt(args[1]);
            Person person = allPeople.get(id);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
            allPeople.remove(id);
            allPeople.add(id, person);
        } else if (argument.equals("-i")) {
            int id = Integer.parseInt(args[1]);
            Person person = allPeople.get(id);
            String sex;
            if (person.getSex().equals(Sex.MALE)) {
                sex = "m";
            } else {
                sex = "f";
            }
            System.out.println(person.getName() + " " + sex + " " + new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH).format(person.getBirthDate()));
        }
    }
}
