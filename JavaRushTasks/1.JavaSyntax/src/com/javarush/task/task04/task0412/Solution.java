package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
   //     System.out.println(n);

        if (n>0) System.out.println(n*2);
        if (n<0) System.out.println(n+1);
        if (n==0) System.out.print(n);

    }

}