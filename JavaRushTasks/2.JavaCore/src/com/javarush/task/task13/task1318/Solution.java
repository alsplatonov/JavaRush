package com.javarush.task.task13.task1318;

/*
Чтение файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        // напишите тут ваш код
        /*
        InputStream inStream = new FileInputStream("c:\\test\\test.txt");
        while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            System.out.write(data); //вывод в консоль
        }
        System.out.println("");

        inStream.close(); //закрываем потоки*/

     //   InputStream inputStream = System.in;
    //    Reader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        InputStream inStream = new FileInputStream(bufferedReader.readLine());
        bufferedReader.close();
        while (inStream.available() > 0){
            System.out.write(/*(char)*/inStream.read());
        }

    /*    while (inStream.available() > 0)
        {
            int data = inStream.read(); //читаем один байт из потока для чтения
            System.out.write(data); //вывод в консоль
        }*/
        System.out.println();
        inStream.close();

    }

}