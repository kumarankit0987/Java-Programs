package com.hashcodeexample2;

import java.util.Objects;

public class User {
    private String name;
    private int id;
    private String email;

    public User(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user=(User)o;
        return this.id==user.id ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
