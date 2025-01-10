class P{
    int p=10;
    public void print(){
        System.out.println("P");
    }
}

class C extends P{
    int c=100;
    public void print(){
        System.out.println("C");
    }
}

public class Main {
    public static void main(String[] args) {
        P obj=new C();
        obj.print();

    }
}