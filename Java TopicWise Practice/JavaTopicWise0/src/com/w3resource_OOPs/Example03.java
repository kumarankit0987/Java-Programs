package com.w3resource_OOPs;

public class Example03 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(12.2,111.3);

        System.out.println("The area of the rectangle is " + rectangle.areaOfRectangle());
        System.out.println("The perimeter of the rectangle is " + rectangle.perimeterOfRectangle());
        rectangle.setHeight(9.0);
        rectangle.setWidth(3.0);

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("The area of the rectangle is " +  rectangle.areaOfRectangle());
        System.out.println("The perimeter of the rectangle is " + rectangle.perimeterOfRectangle());
    }
}
class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public  double areaOfRectangle(){
        double area = width * height;
        return area;
    }
    public double perimeterOfRectangle(){
        double perimeter = 2*(width + height);
        return perimeter;
    }

}
