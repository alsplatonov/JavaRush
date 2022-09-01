package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException, FileNotFoundException {

        FileInputStream filename = new FileInputStream(args[1]);
        FileOutputStream fileOutputName = new FileOutputStream(args[2]);


        while (filename.available() > 0) {
            if (args[0].equals("-e")) {
                char c = (char) filename.read();
                fileOutputName.write(c + 1);

            } else if (args[0].equals("-d")) {
                char c = (char) filename.read();
                fileOutputName.write(c - 1);
            }

        }

        filename.close();
        fileOutputName.close();

    }
}
