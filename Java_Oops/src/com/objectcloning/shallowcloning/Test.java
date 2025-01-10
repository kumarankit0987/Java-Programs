package com.objectcloning.shallowcloning;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        Student obj1 = new Student();
        obj1.rollNo = 121;

        Address address = new Address();
        address.address_id=151;

        obj1.address = address;

        Student obj2 = (Student) obj1.clone();
        obj2.rollNo=123;
        obj2.address.address_id=41;

        System.out.println(obj1.rollNo);
        System.out.println(obj2.rollNo);

        System.out.println("________________");
        System.out.println(obj1.address.address_id);
        System.out.println(obj2.address.address_id);
    }
}
