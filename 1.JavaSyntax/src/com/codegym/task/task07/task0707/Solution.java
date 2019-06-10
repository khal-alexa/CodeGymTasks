package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Tokyo");
        strings.add("Paris");
        strings.add("London");
        strings.add("Kyiv");
        strings.add("New York");
        System.out.println(strings.size());
        for (int i = 0; i <strings.size() ; i++) {
            System.out.println(strings.get(i));
        }
    }
}
