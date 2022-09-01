package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        return name;

    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        return N;

    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double Nd = Double.parseDouble(bis.readLine());
        return Nd;

    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        return str.equals("true");
      //  if (str.equals("true")) return true;
       // if (str.equals("false")) return false;

    }

    public static void main(String[] args) {

    }
}
