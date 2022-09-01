package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            strings.add(s);
        }

        int min = strings.get(0).length();
        int max = strings.get(0).length();

        for (int i = 1; i<strings.size(); i++){

            if (strings.get(i).length() < min)
                min = strings.get(i).length();
            if (strings.get(i).length() > max)
                max = strings.get(i).length();
        }

      //  System.out.println(max);
      //  System.out.println(min);

        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length()==min || strings.get(i).length()==max) { System.out.println(strings.get(i));
            break;}
        }
    }
}
