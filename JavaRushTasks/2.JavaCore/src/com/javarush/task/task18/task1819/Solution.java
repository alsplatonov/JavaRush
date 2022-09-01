package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        bufferedReader.close();


        FileInputStream fileInputStream1 = new FileInputStream(file1);
        byte[] buff1 = new byte[fileInputStream1.available()];

        if (fileInputStream1.available() > 0) {
            int Count1 = fileInputStream1.read(buff1);
        }

        fileInputStream1.close();

        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);
        FileInputStream fileInputStream2 = new FileInputStream(file2);

        byte[] buff2 = new byte[fileInputStream2.available()];

        if (fileInputStream2.available() > 0) {
            int Count2 = fileInputStream2.read(buff2);
            fileOutputStream1.write(buff2);

        }

        fileOutputStream1.write(buff1);
        fileInputStream2.close();
        fileOutputStream1.close();

    }
}
