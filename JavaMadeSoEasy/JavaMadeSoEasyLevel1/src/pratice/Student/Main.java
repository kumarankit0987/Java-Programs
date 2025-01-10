package pratice.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Student s1 = new Student("Pooja",121);
        Student s2 = new Student("Raja",312);
        Student s3 = new Student("Pooja",121);
        students.add(s1);
        students.add(s2);
        students.add(s3);
    }
}
