package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();

        String str = reader.readLine();
        char[] charArray = str.toCharArray();


        for (int i = 0; i <charArray.length ; i++) {
            if (charArray[i] != ' ') list.add(charArray[i]);

        }

        for (int i = 0; i < list.size(); i++) {
            char let = list.get(i);
            if (isVowel(let)) list1.add(let);
            else list2.add(let);

        }
        for (int i = 0; i < list1.size(); i++) {

            System.out.print(list1.get(i) + " ");
        }

        System.out.println();

        for (int i = 0; i < list2.size(); i++) {

            System.out.print(list2.get(i) + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}