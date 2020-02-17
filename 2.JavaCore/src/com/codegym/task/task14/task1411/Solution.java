package com.codegym.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
User, loser, coder and programmer

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        List<String> keys = new ArrayList<>();
        key = reader.readLine();

        while (key.equals("user") || key.equals("loser") || key.equals("coder") || key.equals("programmer")) {
            keys.add(key);
            key = reader.readLine();
        }

        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i).equals("user")) {
                person = new Person.User();
            } else if (keys.get(i).equals("loser")) {
                person = new Person.Loser();
            } else if (keys.get(i).equals("coder")) {
                person = new Person.Coder();
            } else if (keys.get(i).equals("programmer")) {
                person = new Person.Programmer();
            }
            doWork(person);
        }
    }

    public static void doWork(Person person) {
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Programmer) {
            ((Person.Programmer) person).enjoy();
        }
    }
}
