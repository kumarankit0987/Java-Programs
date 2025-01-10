package com.hashcodeAndequals;

import java.util.Comparator;
import java.util.Objects;

public class Item {
    private String name;
    private int id;
    private String brand;
    private Long price;
    private String Category;
    private String subCategory;

    public Item(String name, int id, String brand, Long price, String category, String subCategory) {
        this.name = name;
        this.id = id;
        this.brand = brand;
        this.price = price;
        Category = category;
        this.subCategory = subCategory;
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }


    @Override
    public boolean equals(Object o) { // this equals method belongs to object class
        // so we can override the equals() method
        if (this == o) return true; //
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(price, item.price) && Objects.equals(Category, item.Category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price , Category);
    }

    @Override
    public String toString() {
        return "Name" + " " + "\n" + this.name;
    }
}
