package com.basicInterviewQuestions.immutableclass;

import org.w3c.dom.ls.LSOutput;

// First make the class final
public final class Person {
// Second step is make all instance variable final
    final String panNumber;

    public Person(String panNumber) {
        this.panNumber = panNumber;
    }
// Use only getter method
    public String getPanNumber() {
        return panNumber;
    }

    public static void main(String[] args) {
        Person p1 = new Person("KP098GW");
        System.out.println(p1.getPanNumber());
    }

}
