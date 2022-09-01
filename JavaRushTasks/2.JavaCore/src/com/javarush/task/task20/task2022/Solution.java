package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/
public class Solution implements Serializable, AutoCloseable {
   transient private FileOutputStream stream;
   private String filename;

    public Solution(String fileName) throws FileNotFoundException {
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
  //      out.close();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {

        in.defaultReadObject();
        stream = new FileOutputStream(filename, true);
     //   in.close();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
    //    stream.close();
    }

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{

        Solution sol = new Solution("C:\\t\\3.txt");
        //save  to file
   //     FileOutputStream fileOutput = new FileOutputStream("C:\\t\\2");
        ObjectOutputStream outputStream = new ObjectOutputStream(sol.stream);
        sol.writeObject("aaa");
        outputStream.writeObject(sol);
  //      fileOutput.close();
        outputStream.close();

        //load  from file
    //    FileInputStream fiStream = new FileInputStream("C:\\t\\2");
        FileInputStream fiStream = new FileInputStream(sol.filename);
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Object object = objectStream.readObject();
        fiStream.close();
        objectStream.close();

        Solution newSol = (Solution) object;
        newSol.writeObject("bbb");

        System.out.println(newSol);
    }
}
