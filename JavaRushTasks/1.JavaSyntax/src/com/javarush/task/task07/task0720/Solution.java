package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String s = reader.readLine();
            list.add(s);
        //напишите тут ваш код
    }

         for (int i = 0; i<M; i++){
            String temp = list.get(0);

          //   i+=2;
            list.add(temp);
            list.remove(0);
         }

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));

        }
    }
}

