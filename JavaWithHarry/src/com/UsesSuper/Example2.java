package com.UsesSuper;
class Rectangle {
    int length;
    int width;
    Rectangle(int length,int width) {
        this.length = length;
        this.width = width;
    }
    float area() {
        return length * width;
    }
}
class Cuboid extends Rectangle {
    float height;
    Cuboid(float height) {
        super(5,6);
        this.height = height;
    }
    float volume() {
        return length * width * height;
    }
}
public class Example2 {
    public static void main(String[] args) {
        Cuboid c1 = new Cuboid(6) ;
        float area = c1.area();
        float volume = c1.volume();
        System.out.println("Area of rectangle :" + area);
        System.out.println("volume of cuboid :" + volume);
    }
}
