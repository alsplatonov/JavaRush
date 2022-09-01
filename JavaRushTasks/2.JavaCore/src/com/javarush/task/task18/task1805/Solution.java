package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> bytes = new TreeSet<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//Принимаем имя файла с консоли
        String string = null;//создаем строку куда положим имя файла
//
        string = reader.readLine();//кладем имя файла в переменную
//
        FileInputStream fileInputStream = new FileInputStream(string);//создаем объект потока
//в конструкторе объекта кладем имя файла

        int max = 0;
        while (fileInputStream.available() > 0) //пока остались непрочитанные байты
        {
            int data = fileInputStream.read(); //прочитать очередной байт

            bytes.add(data); //добавить его в bytes
        }
        fileInputStream.close(); // закрываем поток

       for(int b: bytes) {
            System.out.print(b + " ");
        }

    }
}
