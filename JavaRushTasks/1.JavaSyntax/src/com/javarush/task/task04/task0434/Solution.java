package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        int i = 0, j=1;
        while (i<10){
            while (j<=10){
                System.out.print(j*i + j+ " ");
                j++;
            }
            System.out.println("");
            i++;
            j = 1;
        }

    }
}
