package com.UsesSuper;

class Circle {
  float radius;
  float area(float radius) {
      this.radius = radius;
      return 3.14f * radius * radius;
  }
}
class Cylinder extends Circle {
    float height;
    float volume(float height) {
        this.height = height;
        return 3.14f * radius * radius * height;
    }
}
public class Example1 {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        float areaOfCircle = c1.area(3f);
        float volumeOfCylinder = c1.volume(4f);
        System.out.println(areaOfCircle);
        System.out.println(volumeOfCylinder);
    }
}
