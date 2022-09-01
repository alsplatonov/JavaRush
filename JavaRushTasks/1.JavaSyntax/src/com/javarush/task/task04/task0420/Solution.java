package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        int number3 = Integer.parseInt(reader.readLine());
/*
        if(number1 > number2 && number1 > number3 && number2 > number3)
            System.out.println(number1 + " " + number2 + " " + number3);
        if(number1 > number2 && number1 > number3 && number2 < number3)
            System.out.println(number1 + " " + number3 + " " + number2);
        if(number2 > number1 && number2 > number3 && number1 > number3)
            System.out.println(number2 + " " + number1 + " " + number3);
        if(number2 > number1 && number2 > number3 && number1 < number3)
            System.out.println(number2 + " " + number3 + " " + number1);
        if(number3 > number1 && number3 > number2 && number1 > number2)
            System.out.println(number3 + " " + number1 + " " + number2);
        if(number3 > number1 && number3 > number2 && number1 < number2 )
            System.out.println(number3 + " " + number2 + " " + number1);*/

        int arr[] = new int[3];
        arr[0] = number1;
        arr[1] = number2;
        arr[2] = number3;
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0] + arr[1] + arr[2];
        for (int i = 1; i < 3; i++) {
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        int mid = sum - max - min;
        System.out.println(max + " " + mid + " " + min);

    }
}