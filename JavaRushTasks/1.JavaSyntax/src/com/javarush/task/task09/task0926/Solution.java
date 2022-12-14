package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код

        ArrayList<int[]>list = new ArrayList<>();
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{10, 11};
        int[] c = new int[]{20, 21, 22, 23};
        int[] d = new int[]{30, 31, 32, 33, 34, 35, 36};
        int[] e = new int[]{};

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);

        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
