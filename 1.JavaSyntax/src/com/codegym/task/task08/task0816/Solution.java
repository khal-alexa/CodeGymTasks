package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Jolie", df.parse("JULY 15 1978"));
        map.put("Reeves", df.parse("SEPTEMBER 02 1974"));
        map.put("Malcovich", df.parse("DECEMBER 13 1954"));
        map.put("Willis", df.parse("APRIL 24 1949"));
        map.put("Smith", df.parse("JULY 14 1986"));
        map.put("Applegate", df.parse("JANUARY 31 1975"));
        map.put("Moss", df.parse("OCTOBER 10 1991"));
        map.put("Pitt", df.parse("MAY 7 1969"));
        map.put("Lee", df.parse("FEBRUARY 28 1942"));

        //write your code here
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = (Map.Entry<String, Date>) iterator.next();
            String key = pair.getKey();
            Date date = pair.getValue();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            int month = calendar.get(Calendar.MONTH);
            if (month >= 5 && month <= 7) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
    }
}

