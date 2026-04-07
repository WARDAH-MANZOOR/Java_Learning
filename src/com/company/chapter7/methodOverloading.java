package com.company.chapter7;

// Method Overloading: Two or more methods can have the same name but different parameters, such methods
// are called overloaded methods
// parameters:  parameters which are defined in method with values -- int a --- a is here parameter
// arguments : argumets are defining values to parameters e.g: foo(10); here 10 is argument

public class methodOverloading {

    // same method foo but different parameters: one have no parameter other have 'a' as a parameter

    static void foo(){
        System.out.println("hello");
    }
    static void foo(int a){
        System.out.println("hello " + a);
    }

    public static void main(String[] args) {
        foo();
        foo(10);
    }
}
