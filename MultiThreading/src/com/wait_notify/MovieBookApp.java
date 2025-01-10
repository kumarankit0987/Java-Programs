package com.wait_notify;

public class MovieBookApp {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning earning = new TotalEarning();
        earning.start();

        synchronized (earning) {
            //int total = earning.total_earning;
            earning.wait();
            System.out.println("Total Earning = " + " " + earning.total_earning + " rs ");
        }
    }
}
