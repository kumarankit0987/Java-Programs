public class Student {
    String name;
    static String school;
    int rollNo;
    Student(String name,String school,int rollNo){
        this.name = name;
        this.school = school;
        this.rollNo = rollNo;
    }
    void print() {
        System.out.println(name + " " + school + " " + rollNo);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Ankit","Manas",123);
        Student s2 = new Student("Rahul","Manas",124) ;
        Student s3 = new Student("Raja","Manas",125) ;
        Student s4 = new Student("Vinod","Manas",126) ;
        Student s5 = new Student("rakesh","Manas",127) ;
        s1.school = "Bharati School";
        s1.print();
        s2.print();
        s3.print();
        s4.print();
        s5.print();
    }
}
