package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(name);

        bufferedReader.close();

        int count = 0;

        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if (data == 44) count++;
        }

        fileInputStream.close();
        System.out.println(count);
    }
}
