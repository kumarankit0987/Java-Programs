package com.practiceSet10;
class Rectangle {
    int length;
    int width;
    Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public int areaOfRectangle() {
        return length * width;
    }
}
class Cuboid extends Rectangle {
    int height;
    Cuboid(int height) {
        super(10,6);
        this.height = height;
    }
    public int volumeOfCuboid() {
        return length * width * height;
    }
}
public class Question2 {
    public static void main(String[] args) {
        Cuboid obj = new Cuboid(7);
        System.out.println(obj.areaOfRectangle());
        System.out.println(obj.volumeOfCuboid());
    }
}
