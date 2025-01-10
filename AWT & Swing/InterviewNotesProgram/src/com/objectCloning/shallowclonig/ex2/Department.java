package com.objectCloning.shallowclonig.ex2;

class Employee implements Cloneable {
    int id;

    String name;

    public Employee(int id, String name) {
        this.id = id;

        this.name = name;

    }

    // Default version of clone() method. It creates shallow copy of an object.

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class ShallowCopyInJava {

    public static void main(String[] args) {

        Employee emp1 = new Employee (111, "John");

        Employee emp2 = null;

        try {
            // Creating a clone of emp1 and assigning it to emp2

            emp2 = (Employee) emp1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        // Printing the designation of 'emp1'

        System.out.println(emp1.name); // Output : John

        // Changing the name of 'emp2'

        emp2.name = "Ravi";

        // This change will be reflected in original Employee 'emp1'

        System.out.println(emp1.name); // Output : Ravi
    }
}
