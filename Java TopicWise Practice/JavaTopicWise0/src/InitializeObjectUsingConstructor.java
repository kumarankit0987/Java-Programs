public class InitializeObjectUsingConstructor {
    public static void main(String[] args) {
        // Initialize object using Constructor
        Person person = new Person("Raju",22);
        System.out.println(person.name);
        System.out.println(person.age);
    }
}
class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
