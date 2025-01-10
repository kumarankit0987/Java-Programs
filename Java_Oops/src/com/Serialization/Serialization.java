package com.Serialization;

import java.io.*;

public class Serialization  {
    public static void main(String[] args) throws IOException {
        Student student = new Student("Ankit",25);
        // Save object in file
        FileOutputStream fos = new FileOutputStream("ob.txt");

        // for convert object to byte stream we use
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(student);

        oos.close();
        fos.close();
        System.out.println("Object started transferred to file ob !!");
    }
}