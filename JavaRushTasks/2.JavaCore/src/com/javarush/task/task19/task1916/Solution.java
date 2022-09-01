package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {

        BufferedReader filereader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = filereader.readLine();
        String file2 = filereader.readLine();
        filereader.close();

        BufferedReader r1 = new BufferedReader(new FileReader(file1));
        BufferedReader r2 = new BufferedReader(new FileReader(file2));

        StringBuilder s1 = new StringBuilder();
        while (r1.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = r1.read(); //читаем один символ (char будет расширен до int)
            s1.append((char)data);
        }
        r1.close();


        StringBuilder s2 = new StringBuilder();
        while (r2.ready()) //пока есть непрочитанные байты в потоке ввода
        {
            int data = r2.read(); //читаем один символ (char будет расширен до int)
            s2.append((char)data);
        }
        r2.close();


        String[] list1 = s1.toString().split("\\n");
        String[] list2 = s2.toString().split("\\n");


        int len = (list1.length>list2.length)? list1.length : list2.length;


        for (int i = 0; i <list1.length ; i++) {
            for (int j = 0; j <list2.length ; j++) {
                if (list1[i].equals(list2[i]) ) {
                    lines.add(new LineItem(Type.SAME,list1[i]));
                    continue;
                }
                else if (!list1[i].equals(list2[j])) {
                    lines.add(new LineItem(Type.REMOVED,list1[i]));
                }
                else if (!list2[i].equals(list1[i])) lines.add(new LineItem(Type.ADDED,list1[i]));
                //  else if (list1[i].equals(list2[j])) lines.add(new LineItem(Type.REMOVED,list1[i]));
            }


        }


        System.out.println(lines);


    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
//НЕ РЕШЕНО!!!