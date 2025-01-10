package com.Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WorkerThread implements Runnable {
    private String massage;
    WorkerThread(String massage) {

        this.massage = massage;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + "(Start) massage = " + massage);
        processMassage();
        System.out.println(Thread.currentThread().getName() + "End");
    }
    private  void processMassage() {
        try {
            Thread.sleep(2000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class ThreadPool_Example1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for(int i=1; i<10; i++) {
            WorkerThread workerThread = new WorkerThread("Hello" + i);
            executorService.execute(workerThread);
        }
        executorService.shutdown();
        while(executorService.isTerminated()) {

        }
        System.out.println("Finish all thread");
    }
}
