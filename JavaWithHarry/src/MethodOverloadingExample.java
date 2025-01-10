public class MethodOverloadingExample {
    public int method(int a) {
        return a +5;
    }
    public void method() {
        System.out.println("I return nothing");
    }

    public static void main(String[] args) {
         MethodOverloadingExample myObj = new MethodOverloadingExample();
         int sum = myObj.method(12);
         System.out.println(sum);
    }
}
