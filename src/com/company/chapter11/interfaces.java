package com.company.chapter11;
// Interface me sare methods hi abstract hote hain isme koi bhi concrete method matlab simple method nahi hota
// interface  me sare metods ko hi abstract banaya jata ahia ur phr har us class ke liye jo ke interface
// se implement horahi hai us par lazim hai ke sae methods ko override kare wo interface  ke
// dosra ye ke jab bhi hum aik normal class ko dosri class me extend karte hain hum'extends' ka keyword su ekarte
// hain par jab interface ko implement karenge tou hum 'implements' ka keyword use karenge na ke 'extends' ka
// interface banane ke liye hum class ka keyword bhi sue nahi karte
// interface ke methods ko jab implement karte hain tou usko public karna parta hai
// normal class me hum srf aik hi class ko at a time extend karskate matlab child ne parent class ko extend kia par
// child parent1 ki class ko ab extend nahi karsta , par interface me ye possible hai multiple intefaces ko implement
// kia jaskata haia ur extend bhi kia jsakta hai
// hum interface me defined properties ko acess karsakte hain  par unko modify nahi karsakte directly object bnanakar
// dosri vaues dal kar kuin ke inrefcae me jo properties defined hain wo final hain hum in properties ko  bhi
// override karsaktehain us class me jisme humne interface implement kia hai
// hum interface ka object nahi bansakte hain par uska reference banasate ahin
interface Bicycle{
    int a = 45;
    void apply_brake(int decrement); // decrement isliye ke brake lagae se speed decreemet hoti hai
    void speedUp(int increment); // speed up karne se speed increment hoti hai
}
interface HornBicycle{
    void hornTuTu();
    void hornPOPO();
}
class AvonCycle implements Bicycle{
    void blowHorn(){
        System.out.println("pee peeeeeeee");
    }
    public void apply_brake(int decrement){ // interface ke methods ko jab implement karte hain tou usko public karna parta hai
        System.out.println("applying brake");
    }
    public void speedUp(int increment){// interface ke methods ko jab implement karte hain tou usko public karna parta hai
        System.out.println("speeding up");
    }
}
class AvonCycle1 implements Bicycle, HornBicycle{ // this class implements both interfaces
    void blowHorn(){
        System.out.println("pee peeeeeeee");
    }
    public void apply_brake(int decrement){ // interface ke methods ko jab implement karte hain tou usko public karna parta hai
        System.out.println("applying brake");
    }
    public void speedUp(int increment){// interface ke methods ko jab implement karte hain tou usko public karna parta hai
        System.out.println("speeding up");
    }

    @Override
    public void hornPOPO() {
        System.out.println(" PO PO PO");
    }

    @Override
    public void hornTuTu() {
        System.out.println(" Tu Tu Tu");
    }
}
public class interfaces {
    public static void main(String[] args) {
        AvonCycle avonCycle = new AvonCycle();
        avonCycle.apply_brake(5);
        System.out.println(avonCycle.a); // hum properties ko acess karsakte ahin interface ki par unko modify nahi karsakte
        // dosri vaues dal kar kuin ke inrefcae me jo properties defined hain wo final hain

        AvonCycle1 avonCycle1 = new AvonCycle1();
        avonCycle1.speedUp(5);
        System.out.println(avonCycle1.a);
        avonCycle1.blowHorn();
        avonCycle1.apply_brake(5);
        avonCycle1.hornPOPO();
        avonCycle1.hornTuTu();

    }
}
