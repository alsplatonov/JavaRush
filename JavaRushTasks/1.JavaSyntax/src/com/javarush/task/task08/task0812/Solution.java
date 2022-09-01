package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));

        }

        int count = 1;
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                count++;

            } else {
                temp.add(count);
                count = 1;
                temp.add(count);
            }

        }

        int max = temp.get(0);
        for (int i = 0; i < temp.size(); i++) {
               if (temp.get(i)>max) max = temp.get(i);
        //    System.out.println(temp.get(i));
        }
            System.out.print(max);

/*
        int count = 1;
        int max = 1;
        for (int i=0; i<list.size()-1;i++)
        {
            if (list.get(i).equals(list.get(i + 1)))
            {
                count++;
                if (max < count)
                    max = count;
            }
            else
                count=1;
        }
        System.out.println(max);
    }*/
    }
}