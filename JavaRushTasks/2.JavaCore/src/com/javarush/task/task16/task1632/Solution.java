package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) {

        try {
            threads.get(4).start();
            threads.get(4).join();


            threads.get(0).start();


            threads.get(1).start();
            Thread.sleep(1000);
            threads.get(1).interrupt();

            threads.get(2).start();
            //    Thread.sleep(1000);



            threads.get(3).start();
            Thread.sleep(3000);

         //   Thread.sleep(3000);
            if (threads.get(3) instanceof Thread4) ((Thread4) threads.get(3)).showWarning();


        } catch (Exception e) {
            System.out.println("InterruptedException");
        }
    }



    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Thread 1");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {

                }
            }
        }
    }

        public static class Thread2 extends Thread {
            @Override
            public void run() {

                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("InterruptedException");
                }
            }
        }

        public static class Thread3 extends Thread {
            @Override
            public void run() {
                while (!isInterrupted()) {

                    try {
                        System.out.println("Ура");
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }

    public static class Thread4 extends Thread implements Message {
        boolean repeat = true;

        @Override
        public void showWarning() {
            repeat = false;
            System.out.println("Thread 4 stoped");
        }

        @Override
        public void run() {
            while (repeat){
                System.out.println("Thread 4");
                try{
                    Thread.sleep(1000);

                }catch (InterruptedException e){
                    System.out.println("InterruptedException");
                }
            }
        }
    }

        public static class Thread5 extends Thread {
            @Override
            public void run() {
                int Sum = 0;

                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

                try {
                    //   while (reader.ready()) {
                    String N = reader.readLine();
                    while (true) {
                        if (N.equals("N")) break;
                        Sum += Integer.parseInt(N);
                        N = reader.readLine();
                    }
                    //       }
                    reader.close();

                } catch (IOException e) {

                }

                System.out.println(Sum);
            }

        }

}




