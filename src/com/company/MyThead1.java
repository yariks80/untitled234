package com.company;

public class MyThead1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            Thread thread = Thread.currentThread();
            System.out.println("Id - " + thread.getId());
            System.out.println("Name - " + thread.getName());
            System.out.println("Priority - " + thread.getPriority());
            System.out.println("State - " + thread.getState());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
