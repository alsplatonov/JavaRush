package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int arr[] = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        int max = arr[0];
        int min = arr[0];

        if (arr[0]==arr[1] && arr[1]==arr[2]) System.out.print(arr[0]);
        else {
            int sum = arr[0] + arr[1] + arr[2];
            for (int i = 1; i < 3; i++) {
                if (max < arr[i])
                    max = arr[i];
                if (min > arr[i])
                    min = arr[i];
            }
            int mid = sum - max - min;
            System.out.println(mid);
        }

    }
}
