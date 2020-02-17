package com.codegym.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Introducing properties

*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        FileInputStream inputStream = new FileInputStream(fileName);
        load(inputStream);
        inputStream.close();
    }

    public void save(OutputStream outputStream) throws Exception {
        Properties prop = new Properties();
        for (Map.Entry<String, String> entry: properties.entrySet()) {
            prop.put(entry.getKey(), entry.getValue());
        }
        prop.store(outputStream, null);
    }

    public void load(InputStream inputStream) throws Exception {
        Properties prop = new Properties();
        prop.load(inputStream);
        for (String key: prop.stringPropertyNames()) {
            String value = prop.getProperty(key);
            properties.put(key, value);
        }
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution();
        solution.fillInPropertiesMap();
        for (Map.Entry<String, String> entry : properties.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        String secondFile = "FirstFile";
        FileOutputStream outputStream = new FileOutputStream(secondFile);

        solution.save(outputStream);
        outputStream.close();
    }
}
