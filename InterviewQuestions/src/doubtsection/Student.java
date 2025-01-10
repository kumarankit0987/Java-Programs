package doubtsection;

public class Student {
    String name;
    int id;
    static String school;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

     void display() {
        System.out.println(name + " " + id +" " + school);
    }

    public static void main(String[] args) {

        Student s1 = new Student("Raja", 21);
        Student s2 = new Student("Vijay", 1);
        Student s3 = new Student("Sona", 231);
        Student s4 = new Student("Dheeraj", 211);


        s1.display();
        s2.display();
        s3.display();
        s4.display();

    }
}
