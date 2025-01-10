package com.oops;

public class Square {
     int side;
    public int area() {

        return side * side ; // We can see here when we use instance variable in static method it is throwing an errors
    }
    public int parameter() {
        return 4 * side;
    }

    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 2;
        int result1 = sq.area();
        int result2 = sq.parameter();
        System.out.println(result1);
        System.out.println(result2);
    }
}
