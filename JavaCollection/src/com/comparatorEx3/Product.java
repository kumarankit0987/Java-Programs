package com.comparatorEx3;

public class Product {
    private String name;
    private String brand;
    private int id;

    public Product(String name, String brand, int id) {
        this.name = name;
        this.brand = brand;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
