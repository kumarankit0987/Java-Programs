public class Animal {
    public void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Dog is barking");
    }
    public static void main(String[] args) {
        Animal a = new Dog();
        Dog d = new Dog();
    }
}
