package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        Date d = null;
    //    StringBuilder str = new StringBuilder();
        while (reader.ready())
        {

           String str = (reader.readLine());


            Pattern p = Pattern.compile("[\\d]");
            Matcher m = p.matcher(str/*.toString()*/);

            int index = 0;
            while (m.find()){
             index = m.start();
             break;

        }
            try {
                String[] t = str.substring(index).split(" ");
                d = new SimpleDateFormat("dd/MM/yyyy").parse( String.format("%s/%s/%s", t[0], t[1], t[2]) );

            } catch (Exception e){}

                PEOPLE.add(new Person(str.substring(0,index-1), d));
            str = "";
        }
            reader.close();

        System.out.println(PEOPLE);


    }
}
