public class Person {
    String name;
    int id;
    void print() {
        System.out.println(name + " " + id);
    }
}
class Test extends Person {
    public static void main(String[] args) {
       // Person p1 = new Person();
        Person p1 = new Test();
        p1.print();
        Test t = new Test();
        t.print();
    }
}
