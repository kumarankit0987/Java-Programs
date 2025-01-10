public class InitializeObjectUsingInstanceVariable {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.age=23;
        person1.name="Raja";
        System.out.println(person1.name);
        System.out.println(person1.age);
    }
}
class Person1{
    String name;
    int age;

}
