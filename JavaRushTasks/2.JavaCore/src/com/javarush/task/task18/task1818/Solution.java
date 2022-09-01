package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();

        bufferedReader.close();


        FileInputStream fileInputStream2 = new FileInputStream(file2);
        FileInputStream fileInputStream3 = new FileInputStream(file3);

        FileOutputStream fileOutputStream1 = new FileOutputStream(file1);


        while (fileInputStream2.available() > 0){
            int data = fileInputStream2.read();
            fileOutputStream1.write(data);
        }

        fileInputStream2.close();

        while (fileInputStream3.available() > 0){
            int data = fileInputStream3.read();
            fileOutputStream1.write(data);
        }

        fileInputStream3.close();
        fileOutputStream1.close();
    }
}
