package com.company.chapter2;

//DATA TYPES FOR EXPRESSIONS
// Byte + Short = Int data type
// Sort + Int = Int
// Long + Float = Float
// Character + Short = Int
// Character + Int = Int
// Long + Double = Double
// Float + Double = Double


public class DataTypesOfExpressionsAndIncrementDecrementOperators {
    public static void main(String[] args) {
        // data types of expressions
        int a = 5;
        int b = 10;
        System.out.println(a+b);

        // Increment & Decrement Operators
        int i = 55;
        System.out.println(i++);// pehle i ko print karo phr increment karo so it prints i =55
        System.out.println(i); // print ke baad i me increment hogaya hai tou ab print hoga 56
        System.out.println(++i);// pehle increment karo i me phr print karo i tou i 56 hogaya tha ab usm eincrement hoga pehle tou print hoga 57
        System.out.println(i);// ab i ko print karna hai tou i 57 hai tou57 hi print hoga

        // QUIK QUIZ:
        // What will be the value of the following expression(x), int y =7, int x = ++y * 8, value f x?
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);

        char ch = 'a';
        System.out.println(++ch);

    }
}
