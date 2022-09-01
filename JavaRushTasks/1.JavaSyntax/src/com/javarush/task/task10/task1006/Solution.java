package com.javarush.task.task10.task1006;

/* 
Задача №6 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        short b = (short) 45;
        char c = (short) 'd';
        //System.out.println((int)c);
        short s = (short) 2.22;
        //System.out.println(s);
        int i = 150000;
        //System.out.println(i);
        float f = 4.10f;
        //System.out.println(f);
        double d = 1.256d;
        //System.out.println(d);
        double result = (f * b) + (i / c) - (d * s) + 562.78d;
        //System.out.println(f*b);
        //System.out.println(i/c);
        //System.out.println(d * s);
        System.out.println("result: " + result);
    }
}
/// не решено!!