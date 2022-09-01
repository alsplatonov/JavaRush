package com.javarush.task.task09.task0921;

/*
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try {
         //   boolean flag = true;

            while (true) {
                list.add(Integer.parseInt(reader.readLine()));
            }

        } catch (Exception e) {
          //  System.out.println("Exception caught");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }
    }
}
