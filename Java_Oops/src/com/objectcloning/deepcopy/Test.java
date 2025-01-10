package com.objectcloning.deepcopy;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student obj1 = new Student();
        obj1.id = 101;

        Address address = new Address();
        obj1.address = address;
        address.add_id=1211;

        Student obj2 = (Student) obj1.clone();
        obj2.address.add_id=1210;

        System.out.println(obj1.address.add_id);
        System.out.println(obj2.address.add_id);
    }
}
