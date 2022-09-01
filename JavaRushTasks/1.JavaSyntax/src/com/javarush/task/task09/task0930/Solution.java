package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //напишите тут ваш код

        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<String> listStr = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (isNumber(array[i])) listInt.add(Integer.parseInt(array[i]));
            else listStr.add(array[i]);
        }

        for (int i = listInt.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (listInt.get(j) < listInt.get(j + 1)) {

                    int tmp = listInt.get(j);
                    listInt.set(j, listInt.get(j + 1));
                    listInt.set(j + 1, tmp);
                }
            }
        }

        for (int i = listStr.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (isGreaterThan(listStr.get(j), listStr.get(j + 1))) {

                    String tmp = listStr.get(j);
                    listStr.set(j, listStr.get(j + 1));
                    listStr.set(j + 1, tmp);
                }
            }
        }


        ArrayList<String> res = new ArrayList<>();

        if (listInt.size() < listStr.size()) {

            for (int i = 0; i < listInt.size(); i++) {
                res.add(String.valueOf(listInt.get(i)));
                res.add(listStr.get(i));
                if (listStr.isEmpty()) {
                    res.add(String.valueOf(listInt.get(i)));
                }
            }

        } else {
            for (int i = 0; i < listStr.size(); i++) {
                res.add(String.valueOf(listInt.get(i)));
                res.add(listStr.get(i));
                if (listInt.isEmpty()) {
                    res.add(listStr.get(i));
                }
            }
        }

        String[] resArray = res.toArray(new String[res.size()]);

        for (int i = 0; i < resArray.length; i++) {
            array[i] = resArray[i];
        }

    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') // не цифра и не начинается с '-'
                    || (i == 0 && c == '-' && chars.length == 1)) // не '-'
            {
                return false;
            }
        }
        return true;
    }
}
