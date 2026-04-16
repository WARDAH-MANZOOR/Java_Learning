package com.company.chapter11;
// Abstract class : Abstract claas wo hoti hai jisme abstract method ho, abstract class ka object nahi bansakta
// abstract class me abstract methods + other rmethods dono hoskate hain, matlab ye ke abstract class me atleat aik
// abstract method hona lazmi hai

// Abstract method:  wo method jo banaya hua hai par implemneted nahi hai bas banaakr rakhdia hai
abstract class Parent{ // abstract keyword because this class contains abstract method.
    public Parent(){
        System.out.println("Parent");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet(); // ye aik abstract method hai aur jo bhi class is Parent class  se extend
    // horahi hogi wo is abstract method ko override karenge, tou simple matlab ye ke ye abstract method ki waja se abstract
    // class apne bachon s ekehrahi hai ke abstract method ko override karlo dosra ye ke  jab bhi hum abstract
    // method banainge abstract ka keyword lagakar humme class ko bhi abstract banana hoga aik class me 1 abstract method
    // ho ya 10 poori class abstract hojaaigia ur abstract keyword lagana parega shuru me class ke
}
class child1 extends Parent{
    public void greet(){
        System.out.println("Good Morning!");
    }
}
abstract class child2 extends Parent{// yahan child 2 parent class ko extend karrahi jo ke abstract class hai jab bhi abstract class
    // ko extend kia jata ahi uske andsr ke tamam ebatract methods ko override karna parta hai ye lazmi hai, agr aapne
    // override nahi karna tou phr child 2 ko bhi bstract class banado , par yaad rahe ke abstract class ka object nahi banta
    // abhi humne is child 2 ki class me parent2 ka abstrat method(greet) override nahi kiahai jiski waja se class me error
    // aya ke ya tou override karo ay child2 ko hi abtract banado tou yahan humne child2 ko hi abstract banadia
    public void hello(){
        System.out.println("Hello World!");
    }
}
public class abstractClassAndAbstractMethods {
    public static void main(String[] args) {
//        Parent p = new Parent(); // not allowed because Parent cass is abstarct class
        child1 child1 = new child1(); // allowed it is nrmal class with extends abstract class
//        child2 child2 = new child2(); // not allowed  becuase child2 is also an abstract class


    }
}
