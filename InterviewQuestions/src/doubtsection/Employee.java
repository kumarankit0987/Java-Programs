package doubtsection;

public class Employee {
    final String panNumber;

    Employee(String panNumber){
        this.panNumber = panNumber;
    }
    public String getPanNumber() {
        return panNumber;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("16RW12QWR23");
        System.out.println(e1.getPanNumber());
    }
}
