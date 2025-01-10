// Step-1  to make immutable class is make ---- class final
public final class ImmutableClass { // final class not be extended by any subclass
    private final  int a; // Step-2 make instance variable private final

    public ImmutableClass(int  a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        ImmutableClass obj = new ImmutableClass(10);
        int result = obj.getA();
        System.out.println(result);
    }
}
