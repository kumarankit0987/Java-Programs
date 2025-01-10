package com.objectCloning.ex;

public class main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("Raja", 121);
        Employee emp2 = null;

        try{
            // Creating the clone of emp1 object
            emp2 = (Employee)emp1.clone();

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Employee1 :-" + " " + emp1.getName() +" " + emp1.getId());
        emp2.name = "Ankit";
        emp2.id = 221;
        System.out.println("Employee2 :-" + " " + emp1.getName() +" " + emp1.getId());
    }
}
