package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
      //  BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("лира"); //1
        list.add("лоза"); //2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        for (int i = list.size() - 1; i >= 0; /*i--*/){
            String str = list.get(i);
            if (list.get(i).contains("р") && list.get(i).contains("л")) {
                i--;
                continue;
            }
            else if (list.get(i).contains("р")) {
                list.remove(str);
             //   i--;
                continue;
            }
            else if (list.get(i).contains("л")) {
                list.add(i, str);
                i--;
            }
            else {
                i--;
            }
        }


        return list;
    }
}