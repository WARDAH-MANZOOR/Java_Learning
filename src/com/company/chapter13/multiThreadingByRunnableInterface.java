package com.company.chapter13;

// creating threading by implemneting runnable interface
class thread1 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("i am thread1");
            i++;
        }
    }
}
class thread2 implements Runnable{
    public void run(){
        int i=0;
        while(i<100){
            System.out.println("i am thread2");
            i++;
        }
    }
}
public class multiThreadingByRunnableInterface {
    public static void main(String[] args) {
        // by runnable interface: iske liye pehle humme class ak bject banana hota hai phr aik thread ka object jisme
        // runnable interface dena hota hai uske baad start karte hain
        thread1 bullet1=new thread1(); // class object
        Thread gun1 = new Thread(bullet1); // Thread object and passing bullet1(runnable interface)

        thread2 bullet2=new thread2(); // class object
        Thread gun2 = new Thread(bullet2); // Thread object and passing bullet1(runnable interface)

        // starting threads
        gun1.start();
        gun2.start();

    }
}
