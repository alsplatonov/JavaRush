package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());

        for (int i=0; i<=12; i++) {
            if ((a>=0+5*i) & (a<3+5*i)) System.out.println("зелёный");
            else if ((a>=3+5*i) & (a<4+5*i)) System.out.println("жёлтый");
            else if ((a>=4+5*i) & (a<5+5*i)) System.out.println("красный"); }
    }
}