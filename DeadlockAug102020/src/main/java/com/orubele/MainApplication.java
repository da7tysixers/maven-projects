package com.orubele;

import static com.orubele.MainApplication.lock1;
import static com.orubele.MainApplication.lock2;

/**
 *
 * Created by Emmanuel Orubele on Aug 10/2020
 * Thanks to Tim Buchalka my Tutor
 */

public class MainApplication {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    private static class Thread1 extends Thread {
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread1 has  lock1");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread one waiting for lock 2");
                synchronized (lock2) {
                    System.out.println("Thread 1: has lock1 and lock2");
                }
                System.out.println("Thread 1: Released lock2");
            }
            System.out.println("Thread 1: Released lock1. Exiting...");
        }
    }

    private static class  Thread2 extends Thread {
        public void run(){
            synchronized (lock1){
                System.out.println("Thread 2: Has lock1");
                try {
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Thread 2:Waiting for lock2");
                synchronized (lock2){
                    System.out.println("Thread 2: has lock1 and lock2");
                }
                System.out.println("Thread 2: released lock2");
            }
            System.out.println("Thread 2: Released lock1. Exiting...");
        }

    }}