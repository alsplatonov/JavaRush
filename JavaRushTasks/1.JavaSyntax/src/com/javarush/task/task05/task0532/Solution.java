package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(reader.readLine());
            arr[i] = a;
        }

        int max = arr[0];
        for (int i = 1; i < N; i++) {
            if (max < arr[i]) max = arr[i];
        }

            //     int maximum = max(arr, N) ;
            int maximum = max;

            //напишите тут ваш код

            System.out.println(maximum);
        }

 /*   public static int max(int arr[], int N) {

        int max = arr[0];
        for (int i = 1; i < N; i++) {
            if (max < arr[i]) max = arr[i];

        }
        return max;
    }*/
    }

