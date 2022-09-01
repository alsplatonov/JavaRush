package com.javarush.task.task19.task1918;

/* 
Знакомство с тегами
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader filereader = new BufferedReader(new InputStreamReader(System.in));
        String file = filereader.readLine();

        filereader.close();

     //   FileReader reader = new FileReader(file);
        InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
        StringBuilder s = new StringBuilder();

        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            s.append((char)data);
        }
        reader.close();
            String str  = s.toString().trim();
    //    Pattern p = Pattern.compile("<" + args[0] + "[^>]*.*" + "</" + args[0] + ">", Pattern.MULTILINE);
   //     Pattern p = Pattern.compile("<" + args[0] + ".*" +  args[0] + ">");
        Pattern p = Pattern.compile("<(span).*</\\1>", Pattern.MULTILINE);
        Matcher m = p.matcher(str);

        while (m.find()){
            System.out.println(m.group());
        }
    }
}
//НЕ РЕШЕНААА!!