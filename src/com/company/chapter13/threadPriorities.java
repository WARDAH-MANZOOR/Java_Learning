package com.company.chapter13;
class thread3 extends Thread{
    public thread3(String name){
        super(name);// calling thread contructor from Thread which have this name parameter
    }
    public void run(){
        int i = 34;
        System.out.println("Thank you  " + this.getName() + "!");

    }
}
public class threadPriorities {
    public static  void main(String[] args){
        thread3 t1=new thread3("wardah");
        thread3 t2 = new thread3("malaaikah");
        thread3 t3 = new thread3("abdullah");
        thread3 t4 = new thread3("amber");
        thread3 t5 = new thread3("haaiqah");
        // neeche priorities set ki ahin t1 wale thread ko sab se ziada priority milegi baki
        // sab bhi concurrently run honge par ziada t1 wala thread run hoga  , baki t2,t3,t4,t5
        // ki min priority hai tou hai kam run honge
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
