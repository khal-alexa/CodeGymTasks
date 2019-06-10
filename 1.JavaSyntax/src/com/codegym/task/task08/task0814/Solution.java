package com.codegym.task.task08.task0814;

import java.util.*;

/* 
Greater than 10? You're not a good fit for us

*/

public class Solution {
    public static HashSet<Integer> createSet() {
        HashSet<Integer> numbers = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    public static HashSet<Integer> removeAllNumbersGreaterThan10(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (n > 10) {
                iterator.remove();
            }
        }
        return set;
    }

    public static void main(String[] args) {
    }
}
