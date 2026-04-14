package com.company.chapter9;
// access modifiers ki file me humne dekha ke jab hum private access modifier lagate hain tou usse get
// aur set karne ke liye hum . operator ka use nahi kar pate humme har us property ke liye jo private
// hai getter aur setter ka function banana parta hai , is cheez ko hal karne ke liye constructor ka use hota
// hai agr hum har property ke liye gette aur setter likhenge ttou aese tou humme bahut sraa code likhna parega
// isliye aik hi line me kaam karne ke liye hum constructr ka use karte hain.

// Constructor:  A member function used to initialize an object while creating it .
// For writing our own constructor we define a method with name same as the class name , means constructor method name == class name
// jab hum class ke andar hi aik aesa method banainge jiska name same ho class ki tarah tou wo constructor hai ,
// constructor jab banate hain tou usme hum cheezen aik hi jaga define kardete hain jisse humme baar baar getter aur
// setter ka function nahi bannaa parta hai, constructor me hum aruments/parameters bhi paas  kasrakte hain object
// initialization ke time hi
class myEmployeeOld{ // ye function same as access modifier ki file ki tarah hai ye yahan isliye bana hai take humme
    // constructor me farq pata chale ye class yahan private access modifier ke variables define karti hai aur hr
    // private variable ko set aur get karne ke liye alag functions banati hai
    private int id;  // private
    private String name; //private

    public void setId(int i){ // setting id
        id  = i;
    } // setter function
    public void setName(String n){ //setting name
        name = n;
    } // getter function
    public int getId(){ // getting id
        return id;
    }
    public String getName(){  // getting name
        return name;
    }
}

class myEmployeeUsingConstructor{ // is class me ab hum aik aesa method banainge jo same name hoga class ki tarah jisse
    // constructor kehte hain, is constructor me jo private id aur name hai wo hum define kardenge directly tou phr humme
    // getter aur settre ke functions nahi banane parenge hum bas directly unko call karlenge object banakar
    private int id;  // private
    private String name; //private
    // Constructor (no return type)
    public myEmployeeUsingConstructor() {
        id = 45;
        name = "Wardah";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
class myEmployeeUsingConstructorWithParameters{ // is class me bhi aik constructor hi defined hai par is class
    // me contructor me parameters paas kiye gaye hain , aur phr object defined karte waqt arguments aas karege
    // take ow is contructor me jakar data uthakar le aain
    private int id;  // private
    private String name; //private
    // Constructor (no return type)
    public myEmployeeUsingConstructorWithParameters(int myId, String myName) {
        id = myId;
        name = myName;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class constructor {
    public static void main(String[] args) {
        myEmployeeOld e = new myEmployeeOld(); // without constructor class
        e.setId(7); // setting
        e.setName("Bob"); // setting
        System.out.println(e.getName());// getting
        System.out.println(e.getId()); // getting

        // using constructor without parameters/ arguments:
        myEmployeeUsingConstructor constructor = new myEmployeeUsingConstructor();
        System.out.println(constructor.getId());
        System.out.println(constructor.getName());

        // using constructor with parameters/ arguments:
        myEmployeeUsingConstructorWithParameters constructorWithParameters = new myEmployeeUsingConstructorWithParameters(23,"amber");
        System.out.println(constructorWithParameters.getId());
        System.out.println(constructorWithParameters.getName());
    }
}
