package com.oops;

public class GetterAndSetterExample1 {
}
    class Student {
        private String name;
        private int rollNo;
        void setName(String n) {
            name = n;
        }
        void setRollNo(int rn) {
            rollNo = rn;
        }
        String getName() {
            return name;
        }
        int getRollNo() {
            return rollNo;
        }
    }
    class Abc {
        public static void main(String[] args) {
            Student s1 = new Student();
            // we use setName method to store set name of student
            s1.setName("Ankit");
            s1.setRollNo(1080);
            String name = s1.getName();
            int roll = s1.getRollNo();
            System.out.println(name + " " + roll);
        }
    }
