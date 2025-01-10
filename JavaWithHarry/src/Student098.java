public class Student098 {
    String name;
    String rollNo;

    public Student098(String name,String rollNo ) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String toString() {
       return name + " " + rollNo;
    }
    public static void main(String[] args) {
        Student098 s1 = new Student098("Ankit","1211");
        Student098 s2 = new Student098("Ajay","211");
        System.out.println(s1);
        System.out.println(s2);
    }
}
