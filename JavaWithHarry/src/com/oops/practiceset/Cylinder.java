package com.oops.practiceset;

public class Cylinder {
    // create a class cylinder and use getter and setter to set the radius and height of cylinder
    float radius;
    float height;

    public float getRadius() {
        return radius;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float surfaceArea() {
        return 2.0f * 3.412f * radius * height + 2.0f * 3.412f * radius * radius;
    }
    public float volume() {
        return 3.421f * radius * radius * height;
    }

    public static void main(String[] args) {
        Cylinder cl = new Cylinder();
        cl.setRadius(2.5f);
        cl.setHeight(3.5f);
        System.out.println("Surface area of cylinder =" + " " + cl.surfaceArea());
        System.out.println("Volume of cylinder =" + " " + cl.volume());
    }
}
