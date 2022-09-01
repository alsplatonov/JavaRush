package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

         ArrayList<String> strings = new ArrayList<>();


        for (int i = 0; i < 5; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        int min = strings.get(0).length();
        for (int i = 1; i<strings.size(); i++){

            if (strings.get(i).length() < min)
                min = strings.get(i).length();
        }

        //  System.out.println(max);

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length()==min) System.out.println(strings.get(i));
        }
    }
}
