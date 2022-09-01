package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

/*
public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();

        bufferedReader.close();

        FileWriter out = new FileWriter(file2);

        List<String> strings = Files.readAllLines(Paths.get(file1));
        List<String> list = new ArrayList<>();



        for (int i = 0; i <strings.size() ; i++) {
            String[] data = strings.get(i).split(" ");
            for (int j = 0; j <data.length ; j++) {
                list.add(data[j]);
            }

        }

        for (int i = 0; i <list.size() ; i++) {
            double num = Double.parseDouble(list.get(i));
            int res = (int)num; //целая часть
            double res2 = Math.abs(num) - Math.abs(res); //дробная часть

            if (num > 0 && res2 >=0.50){
                out.write(Math.ceil(num) + " ");
        }
        else if (num > 0 && res2<0.50 ) {
                out.write(Math.floor(num) + " ");
            }

            else if (num<0 && res2>0.50){
                out.write(Math.floor(num) + " ");
            }
            else if (num<0 && res2<=0.50){
                out.write(Math.ceil(num) + " ");
            }


        }

        out.close();

    }
}
*/  //РАБОТАЕТ, НО ВАЛИДАЦИЮ НЕ ПРОХОДИТ(МОЕ РЕШЕНИЕ)


//ПРОХОДИТ ВАЛИДАЦИЮ
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader readBuff = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = readBuff.readLine();
        String fileName2 = readBuff.readLine();

        try(BufferedReader reader = new BufferedReader(new FileReader(new File(fileName1)));
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File(fileName2))) )
        {
            String line;
            while((line = reader.readLine()) != null) {
                String[] numbers = line.split(" ");
                for(String num : numbers) {
                    try {
                        int res = (int)Math.round(Double.parseDouble(num));
                        writer.write(res + " ");
                    } catch(NumberFormatException e) {
                        System.out.println(e);
                    }
                }
            }
        } catch(IOException e) {
            System.err.println(e);
        }
    }
}