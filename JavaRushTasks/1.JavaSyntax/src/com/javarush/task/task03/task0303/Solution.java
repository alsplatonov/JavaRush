package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
      double one =  convertEurToUsd(5,1.2);
      System.out.println(one);
      double two =  convertEurToUsd(8,3.2);
      System.out.println(two);
    }

    public static double convertEurToUsd(int eur, double course) {
        //напишите тут ваш код
        return eur*course;
    }
}
