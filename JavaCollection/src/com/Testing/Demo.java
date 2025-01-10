package com.Testing;

public class Demo  {
    int id;
    String name;
    Demo(int id,String name) {

    }
    public static void main(String[] args) {
        Demo d1 = new Demo(11,"Raja");
        Demo d2 = new Demo(12,"Sam");
       if(d1.equals(d2)) {
           System.out.println("print the hashCode");
           System.out.println(d1.hashCode());
           System.out.println();
       }
    }
}
