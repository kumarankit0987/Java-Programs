package com.objectCloning.shallowclonig.ex1;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException{

        Student s1 = new Student();
        s1.name = "Ram";
        s1.id = 21;

        // Create Object of Address Class
        Address address = new Address();
        address.addressId=12;

        // Merge address with the object of student
        s1.address = address;

        // Create Copy of s1 object in s2 object
        Student s2 = (Student)s1.clone();

        s2.name = "Shayam";
        s2.id = 22;
        // Merge the address with object2(s2) And set value in it.
        s2.address.addressId = 23;

        // Print the s1
        System.out.println("s1:" + " " + s1.name + " " +  s1.id);
        System.out.println("s1:" + " " + s1.address.addressId);

        System.out.println("---------------------------------------------------------------");

        System.out.println("s2:" + " " + s2.name + " " +  s2.id);
        System.out.println("s2:" + " " + s2.address.addressId);
    }
}
