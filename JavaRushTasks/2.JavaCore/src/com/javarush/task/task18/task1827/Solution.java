package com.javarush.task.task18.task1827;

/* 
Прайсы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        reader.close();

        String idStr = "";
        String productNameStr = "";
        String priceStr = "";
        String quantityStr = "";


        if (args[0].equals("-c")) {

            productNameStr = args[1];
            if (productNameStr.length() < 30) {
                String t = " ";
                int l = 30 - productNameStr.length();
                for (int i = 0; i < l; i++) {
                    productNameStr += t;
                }
            }


            priceStr = args[2];
            if (priceStr.length() < 8) {
                String t = " ";
                int l = 8 - priceStr.length();
                for (int i = 0; i < l; i++) {
                    priceStr += t;
                }
            }


            quantityStr = args[3];
            if (quantityStr.length() < 4) {
                String t = " ";
                int l = 8 - quantityStr.length();
                for (int i = 0; i < l; i++) {
                    quantityStr += t;
                }
            }


            FileInputStream idInputStream = new FileInputStream(filename);

            while (idInputStream.available() > 0) {
                char c = (char) idInputStream.read();
                if (c == 32) {
                    idStr+=c;
                    continue;
                }
                idStr += c;
            }



            String[] textArray;
            idInputStream.close();

            textArray = idStr.split(" ");

          /*  ArrayList<String> str = new ArrayList<>();
            for (int i = 0; i <textArray.length ; i++) {
                if (!textArray[i].equals(" ")) str.add(textArray[i]);
            }*/

            String text ="";

      //      if (!textArray[0].isEmpty()) {
            if (textArray.length!=0) {

               int idNum = Integer.parseInt(textArray[textArray.length-3]);
               idNum++;

         //       if (textArray[0].length() < 8) {
                String temp = String.valueOf(idNum);
                if (temp.length() < 8) {
                    String t = " ";
                    int l = 8 - temp.length();
                    for (int i = 0; i < l; i++) {
                        temp += t;
                          text = (temp) + productNameStr + priceStr + quantityStr;
                    }
                }

            }  else {
                 textArray[0] = "0      ";
                 text = (textArray[0]) + productNameStr + priceStr + quantityStr;
                 }
               // int idNum = Integer.parseInt(textArray[0]);


                //    StringBuilder ProductStringBuilder = new StringBuilder();
                //    String text =  ProductStringBuilder.append(productNameStr).append(priceStr).append(quantityStr);



                FileWriter writer = new FileWriter(filename, true);
                BufferedWriter bufferWriter = new BufferedWriter(writer);
                bufferWriter.write(text);
                bufferWriter.write("\n");
                bufferWriter.close();


            }
        }

    }

