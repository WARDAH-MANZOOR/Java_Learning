package com.company.chapter2;
// Operators: Operators are used to perform operations on variables and values.
// Types of Operators:
// Arithmetic Operators ---->   +, - , * , / , % , ++ , --
// Assignment Operators ---->   = , +=
// Comparison Operators---->    == , <= , >=
// Logical Operators ---->      && , || , !
// Bitwise Operators ---->      & , | (operates bitwise)
public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 6 - a;
        int c = a * b;
        System.out.println(b);
        System.out.println(c);

        // Assignment Operators
        int d = 10;
        d +=10;
        System.out.println(d);

        // Comparison Operators
        int e = 7;
        int f = 18;
        System.out.println(e==f);

        // Logical Operators
        System.out.println((e<f && e==9));  // and operator me sare conditions true honge tou true aaiga otherwise false
        System.out.println((e<f || e==9)); // OR operator me aik bhi condition true ho tou true hojaiga
    }
}
