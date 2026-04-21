package com.company.chapter13;
// Multithreading and multiprocessing(bahut sare processes aik sath chalana) both are used to achieve multitasking
// within a process multitasking karne ke liye hum threads use karte hain threads process ka hissa hota hai this is
// called multithreading example chrome aik process chrome ke andar multiple tabs threads
// without multithedaing kaam sequence ke hisab se hota ahi example ke tor par aik main function hai usme 3 methods
// hain pehle aik method chalega uska kaam hoga phr dosra phr teesra, aur with multithreading sare methods parallely
// aik sath chalenge time waste nahi hoga bilawaja.
// There are two way to create a thread:  1- By extending thread class, 2- By implemneting runnable interface
// concurrency and parallelism: concurrency me hum aik time par kafi sare kaam manage karrahe hote hain par at a
// time aik hi kama horaha hota hai jes mene whatsapp par msgs bhi karne hain aur cding bhi toume kabhi coding karrahi
/// kabhi messages me don cheezn ko sath me manage karrahi par ai sath nahi karrahi isse concurrency kehte hain
/// parallelism me hum aik hi time me multiple kama karrahe hote hain
/// multithreadig se humme concurrency milti hai, tou matlab ye ke multithreading humme concurrency achieve karke deti hai


class Mythread1 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("Thread1 is running");
            System.out.println("I am happy");
            i++;
        }

    }
}
class Mythread2 extends Thread{
    public void run(){
        int i = 0;
        while(i<40000){
            System.out.println("Thread2 is running");
            System.out.println("I am sad");
            i++;
        }
    }
}
public class multiThreading {
    public static void main(String[] args) {
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        // thread ko start karne ke liye start method hota hai jo khud decide karlega kese chalana hai methdos ko
        // neeche wale dono classes ke sart ethdo ko run karne par ye dono classesko run karraha hai kuch time myThread1 class
        // ko deraha aur kuch MyThread2 ko
        t1.start();
        t2.start();
    }
}
