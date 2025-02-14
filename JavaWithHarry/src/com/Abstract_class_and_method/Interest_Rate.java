package com.Abstract_class_and_method;

    abstract class Bank{
        abstract int getRateOfInterest();
    }
    class SBI extends Bank{
        @Override
        int getRateOfInterest(){
            return 7;
        }
    }
    class PNB extends Bank{
       @Override
       int getRateOfInterest(){
            return 8;
        }
    }

public class Interest_Rate {
        public static void main(String args[]){
            Bank b;
            b=new SBI();
            System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
            b=new PNB();
            System.out.println("Rate of Interest is: "+b.getRateOfInterest()+" %");
        }
    }

