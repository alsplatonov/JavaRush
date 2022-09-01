package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {

        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;

        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String result = outputStream.toString();

        String[] arrStr = result.split(" ");
        //Возвращаем все как было
        System.setOut(consoleStream);

     //   Pattern p = Pattern.compile("[\\d]*");
     //   Matcher m = p.matcher(result);

    /*    StringBuilder stringBuilder = new StringBuilder();
        while (m.find()){
            stringBuilder.append(m.group());

        }*/

     //   String str = stringBuilder.toString();

        int res = 0;
        switch (arrStr[1]){
            case ("+"):
                 res = Integer.parseInt(arrStr[0]) + Integer.parseInt(arrStr[2]);
                break;

            case("-"):
                res = Integer.parseInt(arrStr[0]) - Integer.parseInt(arrStr[2]);
                break;

            case("*"):
                res = Integer.parseInt(arrStr[0]) * Integer.parseInt(arrStr[2]);
                break;

                default:
                {}
                break;

        }


        //выводим ее в консоль
        System.out.println(arrStr[0] + " " + arrStr[1] + " " + arrStr[2] + " = "  + res);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

