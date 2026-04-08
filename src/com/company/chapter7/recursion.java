package com.company.chapter7;
// Recursion: A function in java can call itself, such calling of function by itself is called Recursion.
public class recursion {
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1); // recursion (calling function itself)
        }
    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("the factorial of x is: " + factorial(x));


    }
}
