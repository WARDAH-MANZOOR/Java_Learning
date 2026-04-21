package com.company.chapter13;
class thread extends Thread{
    public thread(String name){
        super(name);// calling thread contructor from Thread which have this name parameter
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you");

    }
}
public class threadConstructor {
    public static void main(String[] args) {
        thread t =new thread("wardah");
        t.start();
        System.out.println("the id of thread is: " + t.getId());
        System.out.println("the name of thread is: " + t.getName());

    }
}
