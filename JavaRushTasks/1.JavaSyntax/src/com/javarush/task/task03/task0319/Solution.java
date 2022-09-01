package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner scanner = new Scanner(System.in);

        String name = reader.readLine();
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();



        System.out.print(name + " получает " + N1 + " через " + N2 + " лет.");

    }
}
