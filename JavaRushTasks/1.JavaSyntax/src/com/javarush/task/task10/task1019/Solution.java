package com.javarush.task.task10.task1019;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> list = new HashMap<>();

        int id;
        String name;
        while (true) {

            try {
                 id = Integer.parseInt(reader.readLine());
                 name = reader.readLine();
            } catch (NumberFormatException e){
              break;
            }

            if (name.equals("")) {
                list.put("", id);
                break;
            }

            list.put(name, id);
        }

        for (Map.Entry<String, Integer> pair : list.entrySet()) {
            String key = pair.getKey();                      //ключ
            int value = pair.getValue();                  //значение
            System.out.println(value + " " + key);

        }
    }
}
