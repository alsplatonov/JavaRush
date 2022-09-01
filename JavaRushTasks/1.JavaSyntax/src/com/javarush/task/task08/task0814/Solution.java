package com.javarush.task.task08.task0814;

import java.util.HashSet;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < 20; i++) {
            set.add(i);

        }
        return set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        //напишите тут ваш код

         set.removeIf((Integer n) -> (n > 10));

        return set;
    }

        public static void main (String[] args){

/*
        HashSet<Integer> temp = new HashSet<Integer>();
        temp = removeAllNumbersMoreThan10(createSet());



            Iterator<Integer> iterator = temp.iterator();
            while (iterator.hasNext()) {
                int x = iterator.next();
                System.out.println(x);
                }*/
            }

}


