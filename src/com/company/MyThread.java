package com.company;

public class MyThread extends Thread{
    public boolean stop;
    @Override
    public void run() {
        while(!stop) {
            System.out.println("Alive...");
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println("Exception" + e.getMessage());
            }
        }
    }
}
