package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);
        byte[] buff = new byte[inputStream.available()];

        while ((inputStream.available()) > 0) {
            inputStream.read(buff);
        }

        for (int i = buff.length - 1; i >= 0; i--) {
            outputStream.write(buff[i]);
        }
        inputStream.close();
        outputStream.close();
    }
}
