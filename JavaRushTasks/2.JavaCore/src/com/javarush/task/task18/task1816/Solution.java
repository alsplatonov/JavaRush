package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        FileReader reader = new FileReader(args[0]);
        int count = 0;
        int c;
        while ((c = reader.read()) != -1) {
            if (((c >= 'a') && (c <= 'z')) || ((c >= 'A') && (c <= 'Z'))) {
                count++;
            }
        }
        reader.close();
        System.out.println(count);
    }
}


/*FileInputStream inputStream = new FileInputStream(args[0]);
byte[] bytes = new byte[inputStream.available()];
int count = inputStream.read(bytes);
inputStream.close();
int counter = 0;
for (byte a : bytes) {
if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122))
{ counter++;
 }
 }
 System.out.println(counter);
 */