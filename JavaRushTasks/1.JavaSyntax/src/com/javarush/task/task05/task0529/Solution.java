package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       // int a = Integer.parseInt(br.readLine());
        String a = br.readLine();
        double sum = 0;

        while (!a.equals("сумма")){

            sum+=Integer.parseInt(a);

            a = br.readLine();

        }

                System.out.print(sum);
            }
        }

