package com.javarush.task.task19.task1925;

/*
import java.io.FileWriter;
import java.io.IOException;
Длинные слова
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

       // FileReader reader = new FileReader(args[0]);
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        FileWriter writer = new FileWriter(args[1]);


        StringBuilder sb = new StringBuilder();
        while (reader.ready()) {
            String[] str = reader.readLine().split(" ");
            for (String s : str)
                if (s.length() > 6)
                    sb.append(s + ",");
        }
        writer.write(sb.substring(0, sb.length()-1));
        reader.close();
        writer.close();
    }
}
