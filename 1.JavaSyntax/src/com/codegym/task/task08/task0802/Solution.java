package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> myHashMap = new HashMap<>();
        myHashMap.put("watermelon", "melon");
        myHashMap.put("banana", "fruit");
        myHashMap.put("cherry", "fruit");
        myHashMap.put("pear", "fruit");
        myHashMap.put("cantaloupe", "melon");
        myHashMap.put("blackberry", "fruit");
        myHashMap.put("ginseng", "root");
        myHashMap.put("strawberry", "fruit");
        myHashMap.put("iris", "flower");
        myHashMap.put("potato", "tuber");

        for (String s: myHashMap.keySet()) {
            String key = s;
            String value = myHashMap.get(s);
            System.out.println(key+" - "+value);
        }
    }
}
