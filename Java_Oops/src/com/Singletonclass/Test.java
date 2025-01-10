package com.Singletonclass;

public class Test {

        public static void main(String[] args) {
            Student obj = Student.getInstance();
            System.out.println(obj.name + " " + obj.id);

            Student obj1 = Student.getInstance();
            System.out.println(obj1.name + " " + obj1.id );
        }

}
