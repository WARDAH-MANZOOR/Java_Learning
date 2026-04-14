package com.company.chapter10;
// this: this is a way for us to reference an object of a class which is being created/referenced, thisis a reference of current object
class Ekclass{
    int a;
    Ekclass(int a ){
        this.a=a; // this is used for reference here
    }
    public int getA(){
        return a;
    }
}
public class thisAndSuperKeyword {
    public static void main(String[] args) {
        Ekclass ekclass = new Ekclass(5);
        System.out.println(ekclass.getA());

    }
}
