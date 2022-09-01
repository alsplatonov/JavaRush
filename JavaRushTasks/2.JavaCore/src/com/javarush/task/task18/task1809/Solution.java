package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        bufferedReader.close();


        FileInputStream fileInputStream = new FileInputStream(file1);

        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        byte[] buff = new byte[fileInputStream.available()];

        if (fileInputStream.available() > 0){
            int count = fileInputStream.read(buff);

            for(int i = 0; i < buff.length / 2; i++)
            {
                byte temp = buff[i];
                buff[i] = buff[buff.length - i - 1];
                buff[buff.length - i - 1] = temp;
            }

            fileOutputStream.write(buff, 0, count);
        }

        fileInputStream.close();
        fileOutputStream.close();

    }
}
