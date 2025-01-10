package com.OOPs;

public class Student {
    String name;
    int id;

    public void display(String name, int id){
        this.name = name;
        this.id = id;

    }

    public  void show(){
        System.out.println(name + " " + id);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        // Using Instance Variable
        s1.name = "Ankit";
        s1.id = 211;
        System.out.println(s1.name);
        System.out.println(s1.id);

        // Using Method
        s1.display("Ankit", 211);
        s1.show();
    }
}
