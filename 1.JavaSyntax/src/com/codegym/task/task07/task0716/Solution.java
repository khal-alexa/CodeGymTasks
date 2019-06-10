package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        for (int i = 0; i <list.size() ; i++) {
            String s = list.get(i);
            if (s.contains("r") && !s.contains("l")) {
                list.remove(i);
                i--;
            }
            else if (s.contains("l") && !s.contains("r")) {
                list.add(i+1, s);
                i++;
            }


        }

        return list;
    }
}