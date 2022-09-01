package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();    // вводим строку и заодно удаляем пробелы в начале и конце строки
        char[] sss = s.toCharArray();     // переводим строку в массив символов
        sss[0] = Character.toUpperCase(sss[0]); // заменяем первую строчную букву строки на заглавную (по факту первый символ массива)
        for (int i = 1; i++ < sss.length;) {  // перебираем массив начиная со 2 элемента
            if (sss[i-1] == ' ') {    // если предыдущий символ "равен пробелу"
                sss[i] = Character.toUpperCase(sss[i]); // то меняем регистр текущего символа
            }
        }
        System.out.println(sss);  // печатаем всю эту петрушку
    }

}
