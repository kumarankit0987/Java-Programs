import java.util.ArrayList;

class Parent1 {
    void method1() {
        System.out.println("I am class A method ");
    }
    void show() {
        System.out.println("Abc");
    }
}
class Child1 extends Parent1 {
    void method1() {
        System.out.println("I am class B method");
    }
}

class Child2 extends Parent1 {
    void method1() {
        System.out.println("I am class c method");
    }
}
class Child3 extends Parent1 {
    void method1() {
        System.out.println("I am class d method");
    }
}
class Abc {
    public static void main(String[] args) {
        Child1 obj1 = new Child1();
        Parent1 obj2 = new Child1();
        Child2 obj3 = new Child2();
        Child3 obj4 = new Child3();

        ArrayList<Parent1> al = new ArrayList<>();
        al.add(obj1);
        al.add(obj2);
    }
}