package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();

        try
        {
            String fileName = reader.readLine();
            BufferedReader fileReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)));
            while (fileReader.ready()){

                String data = fileReader.readLine();
                if (data.equals("")) {
                    continue;
                }
                int i = Integer.parseInt(data);
           //     System.out.println(i);
                if (i % 2 == 0) list.add(i);

            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Collections.sort(list);
        for (Integer i : list){
            System.out.println(i);
        }
    }
}

