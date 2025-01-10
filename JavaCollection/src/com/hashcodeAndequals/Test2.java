package com.hashcodeAndequals;

import com.hashcodeexample2.User;

import java.util.HashSet;
import java.util.Set;

public class Test2 {
    public static void main(String[] args) {
        Set<User> userSet=new HashSet<>();
        userSet.add(new User("A",1,"e"));
        userSet.add(new User("A",1,"e"));

    }
}
