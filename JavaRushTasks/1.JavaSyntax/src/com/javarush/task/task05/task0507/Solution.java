package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        double sum = 0;
        int count = 1;
        while (a!=-1){


            sum+=a;

            a = Integer.parseInt(br.readLine());
            if (a==-1) break;
            count++;
        }
      //  System.out.println(sum);
     //   System.out.println(count);
        double mid = sum/count;
        System.out.print(mid);
    }
}

