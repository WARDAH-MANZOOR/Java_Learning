package com.company.chapter13;
class thread01 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Good Morning");
            System.out.println(Thread.currentThread().getName());

            i++;
        }

    }
}
class thread02 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Welcome");
            i++;
        }

    }
}
class thread03 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Welcome");
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }
            i++;
        }

    }
}

public class practiceSet {
    public static void main(String[] args) {
        System.out.println("PRACTICE QUESTIONS FOR CHAPTER # 13");

        System.out.println("QUESTION # 01: Write a program to print \"Good Morning\" and \"Welcome\" continuously on the screen in Java using threads.");
        thread01 t1 = new thread01();
        thread02 t2 = new thread02();
        t1.start();
        t2.start();

        System.out.println("QUESTION # 02: Add a sleep method in the Welcome thread of Question 1 to delay its execution for 200 ms.");
        thread01 t3 = new thread01();
        thread03 t4 = new thread03();
        t3.start();
        t4.start();

        System.out.println("QUESTION # 03: Demonstrate getPriority() and setPriority() methods in Java threads.");
        thread01 t5 = new thread01();
        thread02 t6 = new thread02();

        t5.setPriority(Thread.MAX_PRIORITY); // 10
        t6.setPriority(Thread.MIN_PRIORITY); // 1

        System.out.println("t5 Priority: " + t5.getPriority());
        System.out.println("t6 Priority: " + t6.getPriority());

        t5.start();
        t6.start();

        System.out.println("QUESTION # 04: How do you get the state of a given thread in Java?");
        thread01 t7 = new thread01();

        System.out.println("State before start: " + t7.getState());
        t7.start();
        System.out.println("State after start: " + t7.getState());

        System.out.println("QUESTION # 05: How do you get a reference to the current thread in Java?");

        Thread current = Thread.currentThread();
        System.out.println("Current Thread Name: " + current.getName());

    }
}
