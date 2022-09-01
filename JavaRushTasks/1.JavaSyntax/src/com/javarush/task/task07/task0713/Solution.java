package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> strings = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        for (int i = 0; i<20; i++){
            strings.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i<strings.size(); i++){

            int x = strings.get(i);
            if (x % 3 ==0 && x % 2 == 0) {
                a.add(x);
                b.add(x);
            }
            else if (x % 3 == 0) a.add(x);
            else if (x % 2 == 0) b.add(x);
            else c.add(x);
        }

        printList(a);
        printList(b);
        printList(c);

    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
