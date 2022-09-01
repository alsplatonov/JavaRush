package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = null;

        while (true){
            String filename = reader.readLine();

            try {
                  fileInputStream = new FileInputStream(filename);
                  fileInputStream.close();
            } catch (FileNotFoundException e){
                System.out.println(filename);
                break;
            }
        }
        reader.close();

    }
}
