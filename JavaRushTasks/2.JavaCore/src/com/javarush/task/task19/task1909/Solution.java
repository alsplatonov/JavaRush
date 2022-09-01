package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader Filereader = new BufferedReader(new InputStreamReader(System.in));
        String fileIN = Filereader.readLine();
        String fileOUT = Filereader.readLine();
        Filereader.close();

        BufferedReader reader = new BufferedReader(new FileReader(fileIN));
        //   FileReader reader = new FileReader(fileIN);

        //    FileWriter writer = new FileWriter(fileOUT);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileOUT));

        StringBuilder str = new StringBuilder();

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            str.append((char)data);
        }
        reader.close();

        String list = str.toString();

        String res = list.replaceAll("\\.", "!");

        writer.write(res);
        writer.close();

    }
}
