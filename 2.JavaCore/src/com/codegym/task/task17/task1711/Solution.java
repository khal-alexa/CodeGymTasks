package com.codegym.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) throws ParseException {
        switch (args[0]) {
            case "-c":
                int personCounterCCase = (args.length - 1) / 3;
                int argsCurrentIndex = 1;
                synchronized (allPeople) {
                    for (int i = 0; i < personCounterCCase; i++) {
                        if (args[argsCurrentIndex + 1].equals("m")) {
                            allPeople.add(Person.createMale(args[argsCurrentIndex], new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[argsCurrentIndex + 2])));
                        } else {
                            allPeople.add(Person.createFemale(args[argsCurrentIndex], new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[argsCurrentIndex + 2])));
                        }
                        argsCurrentIndex = argsCurrentIndex + 3;
                        int id = allPeople.size() - 1;
                        System.out.println(id);
                    }
                }
                break;
            case "-u":
                int personCounterUCase = (args.length - 1) / 4;
                int argsIndex = 1;
                for (int i = 0; i < personCounterUCase; i++) {
                    int id = Integer.parseInt(args[argsIndex]);
                    synchronized (allPeople) {
                        Person person = allPeople.get(id);
                        person.setName(args[argsIndex + 1]);
                        if (args[argsIndex + 2].equals("m")) {
                            person.setSex(Sex.MALE);
                        } else {
                            person.setSex(Sex.FEMALE);
                        }
                        person.setBirthDate(new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH).parse(args[argsIndex + 3]));
                        argsIndex = argsIndex + 4;
                        allPeople.remove(id);
                        allPeople.add(id, person);
                    }
                }
                break;
            case "-d":
                int personCounterDCase = (args.length - 1);
                int argsInd = 1;
                synchronized (allPeople) {
                    for (int i = 0; i < personCounterDCase; i++) {
                        int id = Integer.parseInt(args[argsInd]);
                        Person person = allPeople.get(id);
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                        allPeople.remove(id);
                        allPeople.add(id, person);
                        argsInd++;
                    }
                }
                break;
            case "-i":
                int personCounterICase = (args.length - 1);
                int argsCurrIndex = 1;
                synchronized (allPeople) {
                    for (int i = 0; i < personCounterICase; i++) {
                        int id = Integer.parseInt(args[argsCurrIndex]);
                        Person person = allPeople.get(id);
                        String sex = null;
                        if (person.getSex().equals(Sex.MALE)) {
                            sex = "m";
                        } else {
                            sex = "f";
                        }
                        System.out.println(person.getName() + " " + sex + " " + new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH).format(person.getBirthDate()));
                        argsCurrIndex++;
                    }
                }
                break;
        }
    }
}
