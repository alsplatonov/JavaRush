package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(args[0]);
        FileWriter writer = new FileWriter(args[1]);


   /*     while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            writer.write(data); //пишем один символ (int будет обрезан/сужен до char)
        }*/


        StringBuilder str = new StringBuilder();
        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            str.append((char)data);
        }
        reader.close();


        String list = str.toString();


        Pattern p = Pattern.compile("\\b[\\S]*[\\d]+[\\S]*\\b");
        Matcher m = p.matcher(list);

        while (m.find()){
            writer.write(m.group() + " ");
        }
        //закрываем потоки после использования*/

        writer.close();

    }
}
