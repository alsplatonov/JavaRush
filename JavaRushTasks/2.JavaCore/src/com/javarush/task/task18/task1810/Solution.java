package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file);

        while (true){
            if (fileInputStream.available() >= 1000) {
                 file = bufferedReader.readLine();
                 fileInputStream = new FileInputStream(file);
            }
            else {
                bufferedReader.close();
                fileInputStream.close();
                throw new DownloadException();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
