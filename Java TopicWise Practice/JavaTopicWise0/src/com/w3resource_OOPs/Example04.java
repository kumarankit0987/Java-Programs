package com.w3resource_OOPs;

public class Example04 {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Area of Circle" + " " + circle.areaOfCircle());
        System.out.println("Circumference of Circle" + " " + circle.circumferenceOfCircle());

        circle.setRadius(8);
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Area of Circle" + " " + circle.areaOfCircle());
        System.out.println("Circumference of Circle" + " " + circle.circumferenceOfCircle());
    }
}
class Circle{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return radius;
    }

    public double areaOfCircle(){
        return Math.PI * radius * radius;
    }

    public double circumferenceOfCircle(){
        return 2 * Math.PI * radius;
    }
}
