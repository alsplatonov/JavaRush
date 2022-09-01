package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //    OutputStream outStream = new FileOutputStream(bufferedReader.readLine());
        String path = bufferedReader.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));

        ArrayList<String> list = new ArrayList<>();
        String s;

        do{
         //   String s = bufferedReader.readLine();
            s = bufferedReader.readLine();
            list.add(s);

        }
        while (!s.equals("exit"));

         //   list.add(s);
        bufferedReader.close();


            for (int i = 0; i <list.size() ; i++) {


                String text = list.get(i);
                bw.write(text);
                bw.newLine();
            }



        bw.close();


    }

}
