public class Employee {
    float salary = 40000;
}
class Programmer extends Employee {
    float bonus = 10000;

    public static void main(String[] args){
        Programmer p = new Programmer();
        System.out.println("Salary of Employee" + " " + p.salary);
        System.out.println("Bonus of Employee" + " " +p.bonus);
    }
}
