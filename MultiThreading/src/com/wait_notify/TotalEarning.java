package com.wait_notify;

public class TotalEarning extends Thread{
    int total_earning = 0;

    @Override
    public void run() {
        synchronized (this){
            for(int i = 1; i<=50; i++) {
                total_earning = total_earning + 100;
            }
            this.notify();
        }
    }
}
