class Animal {
    void eat() {
        System.out.println("I am Eating");
    }
}
class  Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating");
    }
}
class Cow extends Animal {
    public void eat() {
        System.out.println("Cow is eating");
    }
}
public class Overriding {
    public static void main(String[] args) {
        //we use to print value of object by reference of Parent class
        //But always print the value of that object
        // new ke bad jo bhi class ka name use kar ke object banate hai
        // i.e; Animal obj1 = new Cow/Dog jiska bhi use krte hai new ke bad
        // usk andr ka code execute hoga
        Animal obj = new Animal();
        obj.eat();
        Animal obj1 = new Dog();
        obj1.eat();
        Animal obj2 = new Cow();
        obj2.eat();
    }
}
