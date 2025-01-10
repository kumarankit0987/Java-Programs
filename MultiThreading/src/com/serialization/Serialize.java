package com.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialize {
    public static void main(String[] args) {

        try {
            Student s1 = new Student("Ram", 121, 21);

            // If we want to write the object in file then we need to  file-output-stream
            FileOutputStream fos = new FileOutputStream("obj.txt");

            // to convert object into byte stream we use object-output-stream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

          // Serialize
          oos.writeObject(s1);
          oos.close();
          fos.close();
        }catch(IOException exception){
            exception.printStackTrace();
        }
    }
}
