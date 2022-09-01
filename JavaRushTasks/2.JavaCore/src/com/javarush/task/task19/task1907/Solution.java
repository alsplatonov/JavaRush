package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader Filereader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = Filereader.readLine();
        Filereader.close();

        FileReader reader = new FileReader(fileName);

        StringBuilder str = new StringBuilder();

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            str.append((char)data);
        }

        reader.close();
        String list = str.toString();
        int count = 0;

     //   Pattern p = Pattern.compile("\\p{Punct}[Ww][Oo][Rr][Ll][Dd]\\p{Punct}|\\p{Punct}[Ww][Oo][Rr][Ll][Dd]|[Ww][Oo][Rr][Ll][Dd]\\p{Punct}");
        Pattern p = Pattern.compile("[^\\w][Ww][oO][rR][lL][dD][^\\w]*");


        Matcher m = p.matcher(list);

        while (m.find()){
            count++;
        }



        System.out.println(count);
        //закрываем потоки после использования


    }
}
