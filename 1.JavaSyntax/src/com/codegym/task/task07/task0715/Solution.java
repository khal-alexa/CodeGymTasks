package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Sam");
        strings.add("I");
        strings.add("Am");

        for (int i = 0; i <6 ; i++) {
            if (i%2==0) {
                continue;
            }
            else {
                strings.add(i, "Ham");
            }

        }
        for (int i = 0; i <strings.size() ; i++) {
            System.out.println(strings.get(i));

        }
    }


}
