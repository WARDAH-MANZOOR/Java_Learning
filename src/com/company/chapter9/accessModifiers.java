package com.company.chapter9;
// Access Modifiers:  specifies where a property/method is accessible.There are four types of access modifiers in java:
// Private, Default, Protected, PUblic
// private: jab hum kissi cheez ko priavte karte hain tou hum .operatr karke usko get nahi karsakte humme getter aur
// setter ka use karna parta hai
class myEmployee{
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
public class accessModifiers {
    public static void main(String[] args) {
        myEmployee e = new myEmployee();
        e.setId(7);
        e.setName("Bob");
        System.out.println(e.getName());
        System.out.println(e.getId());

    }
}
