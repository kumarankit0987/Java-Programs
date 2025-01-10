package com.Testing;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Set<User> setUser = new HashSet<>();
        setUser.add(new User("Ankit",121,"emi1"));
        setUser.add(new User("Ram",123,"ooo2"));
        int hashCode = setUser.hashCode();
        System.out.println(hashCode);
    }
}
