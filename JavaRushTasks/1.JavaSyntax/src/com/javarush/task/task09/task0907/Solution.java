package com.javarush.task.task09.task0907;

/* 
Исключение при работе с числами
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        try {

            int a = 42 / 0;

            //напишите тут ваш код
        } catch (ArithmeticException e) {
           System.out.print("ArithmeticException caught");
        }
    }
}
