
class Parent{
    int a,b;
    Parent(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void print(){
        System.out.println("A"+ a);
        System.out.println("B"+ b);
    }
    public void print(String arg ){
        System.out.println("arg");

    }
    public void print(float arg){
        System.out.println(arg);
    }
    public void print(Float arg){
        System.out.println(arg);
    }
    public void print(int arg1,float arg){
        System.out.println(arg1);
        System.out.println(arg);
    }

}
class Child extends Parent{
    int c,d;
    Child(int c,int d){
        super(2,3);
        this.c=c;
        this.d=d;
    }
    public void print(){
        System.out.println(c);
        System.out.println(d);
    }
}


 class ConstructorQuestion1 {

    public static void main(String[] arg) {
        Parent parent = new Parent(10, 20);
        parent.print(10.0f);
        parent.print("Shyam");
        parent.print();
    }
}