package com.oops.Inheritance;

public class SuperClass {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class SubClass extends SuperClass{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public static void main(String[] args) {
        SuperClass myObj = new SuperClass();
        myObj.setX(11);
        int no = myObj.getX();
        System.out.println(no);

        SubClass myObj1 = new SubClass();
        myObj1.setY(13);
        int no1 = myObj1.getY();
        System.out.println(no1);
        System.out.println(no);

    }
}
