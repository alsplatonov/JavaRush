package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> DoubleTripleList = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) DoubleTripleList.add(list.get(i) + " " + list.get(i));
            else DoubleTripleList.add(list.get(i) + " " + list.get(i) + " " + list.get(i));

        }

  /*      ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            listUpperCase.add(s.toUpperCase());
        }


        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }*/

        for (int i = 0; i < DoubleTripleList.size(); i++) {
            System.out.println(DoubleTripleList.get(i));
        }
    }
}
