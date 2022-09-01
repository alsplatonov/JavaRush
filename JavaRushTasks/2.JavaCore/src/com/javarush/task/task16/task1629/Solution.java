package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException, IOException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        //add your code here - добавьте код тут
        reader.close();
        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        private String str1;
        private String str2;
        private String str3;


        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            try {
                str1 = reader.readLine();
                str2 = reader.readLine();
                str3 = reader.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return str1 + " " + str2 + " " + str3;
        }

        public void printResult(){
            System.out.println(str1 + " " + str2 + " " + str3);
        }
    }
}
/*
public static class Read3Strings extends Thread{
        ArrayList<String> result = new ArrayList<>();
        private int count = 0;

        @Override
        public void run() {
            try {
                while (count < 3) {
                    if (reader.ready()) {
                        result.add(reader.readLine());
                        count++;
                    }
                }
            } catch (IOException e) {
            }
        }

        public void printResult(){
            for(String str : result) {
                System.out.print(str + " ");
            }
            System.out.print("\n");
        }
    }
 */