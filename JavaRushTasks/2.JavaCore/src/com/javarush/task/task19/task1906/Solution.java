package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

  BufferedReader Filereader = new BufferedReader(new InputStreamReader(System.in));
  String fileIN = Filereader.readLine();
  String fileOUT = Filereader.readLine();
  Filereader.close();

        FileReader reader = new FileReader(fileIN);
        FileWriter writer = new FileWriter(fileOUT);
        int count = 1;

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            if (count % 2 == 0) {
                writer.write(data); //пишем один символ (int будет обрезан/сужен до char)
            }
            count++;
        }

        //закрываем потоки после использования
        reader.close();
        writer.close();

    }
}
