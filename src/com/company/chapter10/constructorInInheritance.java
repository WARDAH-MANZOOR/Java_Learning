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
// overloaded constructor in base class
class Base2{  // overloaded constructor
    public Base2(){
        System.out.println("Base class constructor");
    }
    public Base2(int a){ // overloade constructor with 1 parameter a
        System.out.println("the value of a is: "+ a );
    }

}
class Derived2 extends Base2{

    public Derived2(){
        super(23); // calling base class constructor with parameter
        System.out.println("Derived class constructor");
    }
}

// overloaded constructors in both base and derived class

class Base3{  // overloaded constructor
    public Base3(){
        System.out.println("Base class constructor");
    }
    public Base3(int a){ // overloade constructor with 1 parameter a
        System.out.println("the value of a is: "+ a );
    }

}
class Derived3 extends Base3{

    public Derived3(){
        super(23); // calling base class constructor with parameter
        System.out.println("Derived class constructor");
    }

    public Derived3(int x, int y){
        super(23); // calling base class constructor with parameter
        System.out.println("Derived class constructor the value of x is : "+ x + "the value of y is: "+ y);
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


        // overloaded constructors in both base and derived class
        Derived3 derived3 = new Derived3(6,7); // AB YE HAI KE AGR ME IS OBJECT ME ARGUMENTS DALOONGI TOU YE JAAIGA DERIVED
        // CLASS ME DEKHEGA KE DERIVED CLASS ME ARGUMENT WALE CONSTRUCTOR ME KIA LIKHA HAI AGR USME SUPER KA KEY WORD HAI
        // TOU WO BASE KE PARAMETER WALE CONSTRCUTOR KO PRINT KAREGA NAHI TOU BAGHAIR PARAMETER WALE CONSTRUCTOR KO
        // PRINT KAREGA PEHLE USKE BAAT DERIVED CLASS KE ARGUMENTW ALE CONSTRUCTORME JO HOGA WO PRINT KAREGA

        // AGR ARGUMENTS NAHI DALTE IS OBJECT ME TOU YE PEHLE JAAIGA DERIVE CLASS ME AUR DEKHEGA KE DERIVED CLASS
        // ME WITHOUT PARAMETER WALE CONSTRUCTORME KIA LIKHA HAI AGR USME SUPER KA KEYWORD HOGA TOU YE BASE
        // CLASS KE PARAMETERS WALE CONSTRUCTOR KO CALL KAREGA OTHERWISE WITHOUT PARAMETER WALE KO KAREGA HR
        // DERIVE CLASS KE CONSTRUCTOR KO CALL KAREGA WITHOUT PARAMETERW ALE
        Base3 base3 = new Base3();

    }
}
