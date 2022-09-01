package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

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

     //   String list = str.toString();
        String [] list = str.toString().split(" ");

        for (int i = 0; i < list.length; i++) {
          if (isDigit(list[i])) writer.write(list[i] + " ");
        }

        /// Не работает с кириллицей!!!
   /*     Pattern p = Pattern.compile("\\b\\d+\\b", Pattern.UNICODE_CHARACTER_CLASS);
        Matcher m = p.matcher(list);

        while (m.find()){
           writer.write(m.group());
            writer.write(" ");
        }*/


        writer.close();

    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
