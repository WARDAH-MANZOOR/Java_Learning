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
public class constructor {
    public static void main(String[] args) {
        myEmployeeOld e = new myEmployeeOld(); // without constructor class
        e.setId(7); // setting
        e.setName("Bob"); // setting
        System.out.println(e.getName());// getting
        System.out.println(e.getId()); // getting
    }
}
