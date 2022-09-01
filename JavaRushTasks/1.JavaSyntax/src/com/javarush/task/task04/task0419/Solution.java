package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());

        int arr[] = new int[4];
        arr[0]=a; arr[1]=b; arr[2]=c; arr[3]=d;
        int max = arr[0];
        for (int i = 1; i<4; i++){
            if (max<arr[i])
                max = arr[i];
        }
        System.out.print(max);
    }
}
