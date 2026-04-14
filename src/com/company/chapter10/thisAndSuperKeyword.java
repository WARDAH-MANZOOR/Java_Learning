package com.company.chapter10;
// this: this is a way for us to reference an object of a class which is being created/referenced, thisis a reference
// of current object

// super: A reference variable used to refer immediate parent class object.
//    - can be used to refer immediate parent class instance variables
//    - can be used to invoke parent class methods
//    - can be used to invoke parent class constructors
class Ekclass{
    int a;
    Ekclass(int a ){
        this.a=a; // this is used for reference here
        System.out.println(a);
    }
    public int getA(){
        return a;
    }
}
class DoClass extends Ekclass{
    int a;
    DoClass(int b){
        super(b);
        System.out.println("DoClass");
    }
}
public class thisAndSuperKeyword {
    public static void main(String[] args) {
        Ekclass ekclass = new Ekclass(3);
        System.out.println(ekclass.getA());
        DoClass doClass = new DoClass(5);



    }
}
