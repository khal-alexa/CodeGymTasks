package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream1 = new FileOutputStream(file2);
        FileOutputStream outputStream2 = new FileOutputStream(file3);

        int allBytesAmount = inputStream.available();
        byte[] buff = new byte[allBytesAmount];

        while ((inputStream.available()) > 0) {
            int count = inputStream.read(buff);
            int half = count / 2;
            int arrayLength = buff.length;
            if (count % 2 == 0) {
                outputStream1.write(buff, 0, half);
                outputStream2.write(buff, arrayLength / 2, half);
            } else {
                outputStream1.write(buff, 0, half + 1);
                outputStream2.write(buff, arrayLength/2 + 1, half);
            }
        }
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
