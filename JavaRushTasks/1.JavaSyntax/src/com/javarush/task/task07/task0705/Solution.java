package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20];

        for (int i = 0; i < list.length; i++) {
            String s = reader.readLine();
            list[i] = Integer.parseInt(s);
        }

        int a[] = new int[10];
        int b[] = new int[10];

        for (int i = 0; i<10; i++){
            a[i] = list[i];
        }

        for (int i = 10; i<20; i++){
            b[i-10] = list[i];
        }

        for (int i = 0; i<b.length; i++) {
            System.out.println(b[i]);
        }


    }
}
