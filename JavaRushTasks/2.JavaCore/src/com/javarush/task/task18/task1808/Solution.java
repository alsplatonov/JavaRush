package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        String file3 = bufferedReader.readLine();

        bufferedReader.close();


        FileInputStream fileInputStream = new FileInputStream(file1);

        FileOutputStream fileOutputStream1 = new FileOutputStream(file2);
        FileOutputStream fileOutputStream2 = new FileOutputStream(file3);

        byte[] buff1 = null;


        if (fileInputStream.available() % 2 ==0) {
            buff1 = new byte[fileInputStream.available() / 2];
        }
        else buff1 = new byte[fileInputStream.available() / 2 + 1];



      byte[] buff2 = new byte[fileInputStream.available()/2];


      if (fileInputStream.available() > 0){

            int count1 = fileInputStream.read(buff1);
            fileOutputStream1.write(buff1, 0, count1);

          int count2 = fileInputStream.read(buff2);
          fileOutputStream2.write(buff2, 0, count2);
        }

      fileInputStream.close();
      fileOutputStream1.close();
      fileOutputStream2.close();

    }
}
