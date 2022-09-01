package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        String id = args[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        //     FileInputStream inputStream = new FileInputStream(b);

        reader.close();
        String s = "";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        ArrayList<String> list = new ArrayList<>();
        //    reader.ready //возвращает true если чтение еще возможно
        //   reader.readLine() // читает и возвращает одну строку из файла

        while (bufferedReader.ready()) {
            String c = bufferedReader.readLine();
            list.add(c);
        }

        bufferedReader.close();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).startsWith(id + " ")) System.out.println(list.get(i));
        }

    }
}
