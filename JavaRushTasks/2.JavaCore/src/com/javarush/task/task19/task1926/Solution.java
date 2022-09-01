package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader filereader = new BufferedReader(new InputStreamReader(System.in));
        String fileIN = filereader.readLine();
        filereader.close();

       // FileReader reader = new FileReader(fileIN);
        BufferedReader reader = new BufferedReader(new FileReader(fileIN));


        StringBuilder s = new StringBuilder();

            while (reader.ready()) {
                String str = reader.readLine();
                s.append(str);
                System.out.println(s.reverse());
                s.delete(0, s.length());

        }
        reader.close();


    }
}
