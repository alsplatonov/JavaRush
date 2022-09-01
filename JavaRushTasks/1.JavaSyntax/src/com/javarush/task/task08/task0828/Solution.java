package com.javarush.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Номер месяца
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String month = reader.readLine();

        HashMap<String, Integer> monthes = new HashMap<>();

        monthes.put("January", 1);
        monthes.put("February", 2);
        monthes.put("March", 3);
        monthes.put("April", 4);
        monthes.put("May", 5);
        monthes.put("June", 6);
        monthes.put("July", 7);
        monthes.put("August", 8);
        monthes.put("September", 9);
        monthes.put("October", 10);
        monthes.put("November", 11);
        monthes.put("December", 12);

        Iterator<Map.Entry<String, Integer>> iterator = monthes.entrySet().iterator();

        while (iterator.hasNext())
        {
            //получение «пары» элементов
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();            //ключ
            Integer value = pair.getValue();        //значение
            if (key.equals(month))
            {
            //    System.out.print("\""+month + " is the " + value + " month\".");
                System.out.println(month + " is the " + value + " month");
           break;
            }

        }
    }
}
