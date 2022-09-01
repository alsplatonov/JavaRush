package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public  class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes i) throws IllegalArgumentException {
        ImageReader IR = null;

   //     try {
         // для перечисляемых типов можно использовать == для сравнения. не выбрасывает NullPointerException
             if (i==ImageTypes.BMP) IR = new BmpReader();
            else if (i==ImageTypes.JPG) IR =  new JpgReader();
            else if (i==ImageTypes.PNG) IR =  new PngReader();
            else throw new IllegalArgumentException("Неизвестный тип картинки");
      /*  } catch (IllegalArgumentException e) {
            System.out.println("Неизвестный тип картинки");
        }*/

        return IR;

    }
}
