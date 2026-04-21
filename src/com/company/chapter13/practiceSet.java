package com.company.chapter13;
class thread01 extends Thread{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("Good Morning");
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

        System.out.println("QUESTION # 04: How do you get the state of a given thread in Java?");

        System.out.println("QUESTION # 05: How do you get a reference to the current thread in Java?");

    }
}
