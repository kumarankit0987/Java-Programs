package com.practiceSet10;
class Circle {
    float radius;
    Circle(float radius) {
        this.radius = radius;
    }
    public float area() {
        return 3.14f * radius * radius;
    }
}
class Cylinder extends Circle {
    float height;
    Cylinder(float height, float radius) {
        super(radius);
        this.height = height;
    }
    public float volume() {
        return 3.14f * radius * radius * height;
    }
}
public class Question1 {
    public static void main(String[] args) {
        Cylinder obj1 = new Cylinder(5,4);
        System.out.println(obj1.area());
        System.out.println(obj1.volume());
        // Hum cylinder ka object create kar ke circle
        //  ke method ko call kar sakte hai
        // But Circle ka object create kar ke cylinder
        // ke method ko call kar nhi sakte hai

        //obj1.height();//we can see this is throws an error
        //because height() method is of class cylinder
        // And call from circle
    }
}
