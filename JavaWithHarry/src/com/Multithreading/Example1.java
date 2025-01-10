package com.Multithreading;


class Pojo{
    int a;
    Pojo(int val){
        this.a=val;
    }

    public Pojo() {
    }

    @Override
    public String toString() {
        return "Pojo{"+ this.hashCode() +
                "a=" + a +
                '}';
    }
}
public class Example1 {
    public static void main(String[] args) {
        Pojo pojo=new Pojo();
        for (int i = 0; i <5 ; i++) {
           pojo.a=i;
            System.out.println(pojo.toString());
        }
    }
}
//    Pojo{363771819a=0}
//    Pojo{1389133897a=1}
//    Pojo{1534030866a=2}
//    Pojo{664223387a=3}
//    Pojo{824909230a=4}