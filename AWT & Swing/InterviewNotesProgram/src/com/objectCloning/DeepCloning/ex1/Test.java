package com.objectCloning.DeepCloning.ex1;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student();
        s1.name = "Radha";
        s1.id = 121;

        // Create Object of Address Class
        Address address = new Address();
        s1.address= address;
        s1.address.city = "Patna";

        Student s2 = (Student) s1.clone();
        s2.name = "Rohit";
        s2.id = 122;
        s2.address.city ="Kolkata";

        System.out.println(s1.name + " " +  s1.id);
        System.out.println(s1.address.city);

        System.out.println("--------------------------------------------");

        System.out.println(s2.name + " " +  s2.id);
        System.out.println(s2.address.city);
    }
}
