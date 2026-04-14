package com.company.chapter10;
// when a derived class is extended from the base class , the constructor of the base class is  executed first
// followed by the constructor of the derived class

class Base1{
   public Base1(){
       System.out.println("Base class constructor");
   }

}
class Derived1 extends Base1{
   public Derived1(){
       System.out.println("Derived class constructor");
   }
}

class Base2{  // overloaded constructor
    public Base2(){
        System.out.println("Base class constructor");
    }
    public Base2(int a){ // overloade constructor with 1 parameter a
        System.out.println("the value of a is: "+ a );
    }

}
class Derived2 extends Base2{// overloaded constructor

    public Derived2(){
        super(23); // calling base class constructor with parameter
        System.out.println("Derived class constructor");
    }
}
public class constructorInInheritance {
    public static void main(String[] args) {
        Derived1 derived = new Derived1(); // pehle base class me agr constructor haitou wo execute hoga uske baad
        // derived class ka constructor execute hoga , kuike derived class base class se extended hai
        Base1 base = new Base1();


        Derived2 derived2 = new Derived2();  // pehle base class ke constructr aainge phr derived class ke ab yehai
        // ke base class me 2 overloaded constructors hainmatlba same name bt aik me parameter jaraha aur aik me
        // nahi agr mujhe parameter wala constructor call karna hai tou me super ka keyword use karoongi derive class
        // me aur usme argument doongi take wo constructr call ho base class ka jsme parameter jaraha hai aur agr me
        // super nahi likhti tou srf wahi constructor call hoga jisme parameters nahi jarahe
        Base2 base2 = new Base2();

    }
}
