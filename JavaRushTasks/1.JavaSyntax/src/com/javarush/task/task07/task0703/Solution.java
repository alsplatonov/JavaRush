package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String strArr[] = new String[10];
        int arr[] = new int[10];

        for (int i = 0; i<10; i++){
            String str = reader.readLine();
            strArr[i] = str;
        }
        for (int i = 0; i<10; i++){
            arr[i] = strArr[i].length();
        }

        for (int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
