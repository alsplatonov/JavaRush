package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;



    static {
        try
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            firstFileName  = reader.readLine();
            secondFileName = reader.readLine();

            reader.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //add your code here - добавьте код тут

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        //add your code here - добавьте код тут
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface{

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
    public static class ReadFileThread extends Thread implements ReadFileInterface{
        private String filename;  // вот тут про эту строку ни слова в условии, но без нее хз как запилить
        private String filecontent =""; // про эту так же ни слова, аналог выше

        ArrayList<String> result = new ArrayList<>();

        @Override
        public void setFileName(String fullFileName) {
            filename = fullFileName;
        }



        @Override
        public String getFileContent() {

            if (!filecontent.isEmpty())
            return filecontent;
            else return "";
        }

   /*     @Override
        public void join() throws InterruptedException {

        }

        @Override
        public void start() {

        }*/

        @Override
        public void run() {
            try {

                BufferedReader reader = new BufferedReader(new FileReader(new File(filename)));
                // создаем reader типа буфера новый буфер для чтения
                // (из нового файла для чтения(с новым файлом (имя которого)))
                while (reader.ready()) // пока в reader'е есть что читать
                {
                    filecontent += reader.readLine() + " "; // дописываем строку к filecontent и + пробел
                }
                reader.close(); // закрываем этот ридер
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    }

