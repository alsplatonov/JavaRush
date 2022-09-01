package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int arr[] = new int[3];
        arr[0]=a; arr[1]=b; arr[2]=c;

        int count = 0;
        for (int i = 0; i<3; i++){
            if (arr[i]>0) count++;
        }
        System.out.print(count);

    }
}
