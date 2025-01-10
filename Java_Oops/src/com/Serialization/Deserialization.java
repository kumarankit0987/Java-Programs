package com.Serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // To read the file we use FileInputStream
        FileInputStream fis = new FileInputStream("ob.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);

        Student student = (Student) ois.readObject();
        System.out.println(student.getName());
        System.out.println(student.getId());
        student.display();
    }
}
