package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {


    }

    public static class PersonScannerAdapter implements PersonScanner{

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {

            String[] strings = null;
            Date d = null;
            String person = "";


            person = fileScanner.nextLine();

            strings = person.split(" ");

            try {
                d = new SimpleDateFormat("dd/MM/yyyy").parse( String.format("%s/%s/%s", strings[3], strings[4], strings[5]) );

            } catch (Exception e){}

            return new Person(strings[1], strings[2], strings[0], d);

        }


        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
