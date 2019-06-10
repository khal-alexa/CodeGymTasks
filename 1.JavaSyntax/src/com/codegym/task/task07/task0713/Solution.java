package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> divisibleBy3 = new ArrayList<>();
        ArrayList<Integer> divisibleBy2 = new ArrayList<>();
        ArrayList<Integer> otherNumbers = new ArrayList<>();

        for (int i = 0; i <20 ; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i <mainList.size() ; i++) {
            if (mainList.get(i)%3 == 0 && mainList.get(i)%2 == 0) {
                divisibleBy3.add(mainList.get(i));
                divisibleBy2.add(mainList.get(i));
            }
            else if (mainList.get(i)%3 == 0) {
                divisibleBy3.add(mainList.get(i));
            }
            else if (mainList.get(i)%2 == 0) {
                divisibleBy2.add(mainList.get(i));
            }
            else {
                otherNumbers.add(mainList.get(i));
            }
        }
        printList(divisibleBy3);
        printList(divisibleBy2);
        printList(otherNumbers);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
}
