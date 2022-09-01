package com.javarush.task.task20.task2017;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* 
Десериализация
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {
        Object object = null;
        try {
            object = objectStream.readObject();
            objectStream.close();
        } catch (Exception e){
            System.out.println("Exception!");
            return null;
        }

        if (object instanceof A) return (A)object;
        if (object instanceof B) return (B)object;
        else return null;
    }

    public class A implements Serializable{
    }

    public class B extends A  {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
