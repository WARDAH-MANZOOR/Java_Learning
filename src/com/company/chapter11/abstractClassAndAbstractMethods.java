package com.company.chapter11;
// Abstract class : Abstract claas wo hoti hai jisme abstract method ho
// Abstract method:  wo method jo banaya hua hai par implemneted nahi hai bas banaakr rakhdia hai
abstract class Parent{ // abstract keyword because this class contains abstract method.
    public Parent(){
        System.out.println("Parent");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet(); // ye aik abstract method hai aur jo bhi class is Parent class  se extend
    // horahi hogi wo is abstract class ko override karsakte hain, tou simple matlab ye ke ye abstract method ki waja se abstract
    // class apne bachon s ekehrahi hai ke abstract method ko override karlo karna hai tou dosra ye ke  jab bhi hum abstract
    // method banainge abstract ka keyword lagakar humme class ko bhi abstract banana hoga aik class me 1 abstract method
    // ho ya 10 poori class abstract hojaaigia ur abstract keyword lagana parega shuru me class ke
}
public class abstractClassAndAbstractMethods {
    public static void main(String[] args) {

    }
}
