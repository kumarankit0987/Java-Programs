public class MethodOverridingExample1 {
    void method(int a) {
        System.out.println(a * a);
    }

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();
        obj.method(10);
    }
}
