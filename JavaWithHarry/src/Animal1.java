public class Animal1 {
    void walk() {
        System.out.println("Any Animal can walk");
    }
}
class Dog1 extends Animal1{
    void walk() {
        System.out.println("Dog can run");
    }

    public static void main(String[] args) {
        Animal1 obj = new Animal1();
        Animal1 obj1 = new Dog1();
        obj.walk();
    }
}
