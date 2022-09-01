package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);

        int count = 0;
        int SpaceCount = 0;
        while (inputStream.available() > 0) {
             int data = inputStream.read();
             count++;
             if (data == 32) SpaceCount ++;
        }

        inputStream.close();



        double res = SpaceCount/count*100.0;
        System.out.println(String.format("%.2f", res));

    }
}


///НЕ РЕШЕНАААА!!!