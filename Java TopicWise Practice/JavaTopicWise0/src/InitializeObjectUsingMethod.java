public class InitializeObjectUsingMethod {
    public static void main(String[] args) {
        Person3 person3 = new Person3();
        person3.display("Ankit",23);
    }
}
class Person3{
    String name;
    int age;

    public void display(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Name" + " " + name);
        System.out.println("Age" + " " + age);
    }
}
