package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static{
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader filereader = new BufferedReader(new InputStreamReader(System.in));
        String fileOUT = filereader.readLine();
        filereader.close();


        FileReader reader = new FileReader(fileOUT);


        StringBuilder str = new StringBuilder();
        while (reader.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = reader.read(); //читаем один символ (char будет расширен до int)
            str.append((char)data);
        }
        reader.close();

        String[] list = str.toString().split(" ");
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();

        for (int i = 0; i <list.length ; i++) {
            for (Map.Entry<Integer, String> pair : map.entrySet())
            {
                Integer key = pair.getKey(); //ключ
                if (list[i].equals(String.valueOf(key))) list[i] = pair.getValue();
           //     String value = pair.getValue(); //значение
            }
        }

        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + " ");
        }

    }
}
