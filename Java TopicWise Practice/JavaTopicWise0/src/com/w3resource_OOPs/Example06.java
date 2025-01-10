package com.w3resource_OOPs;

public class Example06 {
    public static void main(String[] args) {

    }
}
class Employee{
    String name;
    String job_title;
    String salary;

    public Employee(String name, String job_title, String salary) {
        this.name = name;
        this.job_title = job_title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }


}
