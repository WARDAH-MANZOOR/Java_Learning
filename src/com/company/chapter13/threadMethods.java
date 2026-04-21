package com.company.chapter13;
class thread4 extends Thread{

    public void run(){
        int i = 0;
        while(i<500){
            System.out.println("Thank you thread1 ");
            i++;
        }

    }
}
class thread5 extends Thread{

    public void run(){
        int i = 0;
        while(i<500){
            System.out.println("Thank you thread2 ");
            i++;
        }

    }
}
public class threadMethods {
    public static void main(String[] args){
        thread4 t1 = new thread4();
        thread5 t2 = new thread5();
        t1.start();
        // agr hum chahte hain ke t1 jab tak khatam na ho tab tak t2 start na ho tou hum .join method use karenge
        // par masla ye hai ke agr hum direct srf t1.join() likhdenge tou error aaiga kuinke aesa h tou hoskata hai
        // ke t1 ke khatam hone se pehle hi wo interuupt hojai isliye humme t1.join() ko try catch ke block me dalna hota hai
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

        t2.start();

    }
}
