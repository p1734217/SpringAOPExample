package com.test;

class FirstThread extends Thread {
 
    String threadName;
 
    public FirstThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Created Thread " + threadName);
    }
 
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("From : " + threadName + " .." + i);
                sleep(1000);
 
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
 
public class Test11 {
 
    public static void main(String[] args) {
        try {
            FirstThread firstThread = new FirstThread("First Thread");
            firstThread.start();
        //    firstThread.join();
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread : " + i);
            }
            System.out.println(" Main Thread : " + Thread.currentThread().isAlive());
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
}